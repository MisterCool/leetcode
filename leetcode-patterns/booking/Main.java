import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//budget: 309
//days_per_city: 2
//hotels: {
//    'Paris':  [1,2,3,4,5,6],
//    'London': [25,36,65,57,90,110],
//    'Munich': [67,2,10,18,36,70]
//},
// Задача: вывести обратно все возможные стоимости маршрутов, которые укладываются в бюджет, в порядке возрастания

//
public class Main {

    public static void main(String[] args) {
        Map<String, List<Integer>> hotels = Map.of(
            "Paris", List.of(1, 2, 3, 4, 5, 6),
            "London", List.of(25, 36, 65, 57, 90, 110),
            "Munich", List.of(67, 2, 10, 18, 36, 70));

        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int daysPerCity = 2;
        int budget = 309;
        boolean[] visited = new boolean[daysPerCity * hotels.size()];
        backtrack(budget, daysPerCity, hotels, 0, list, result, 0, List.of("Paris", "London", "Munich"), visited);


        System.out.println(result.stream().sorted().collect(Collectors.toList()));
    }


    public static void backtrack(int budget, int daysPerCity, Map<String, List<Integer>> hotels, int cost, List<Integer> costs,
                                 List<Integer> result, int index, List<String> cityNames, boolean[] visited) {

        if (cost > budget) {
            return;
        }
        if (costs.size() == daysPerCity * hotels.size()) {
            result.add(cost);
            return;
        }

        String s = cityNames.get(index);

        for (int i = 0; i < hotels.get(s).size(); i += daysPerCity) {
            if (visited[i]) continue;
            int sum = 0;
            for (int j = i; j < i + daysPerCity; j++) {
                costs.add(hotels.get(s).get(j));
                sum += hotels.get(s).get(j);
                visited[j] = true;
            }

            backtrack(budget, daysPerCity, hotels, cost + sum, costs,
                result, index + 1, cityNames, visited);

            for (int j = i; j < i + daysPerCity; j++) {
                sum -= costs.get(costs.size() - 1);
                costs.remove(costs.size() - 1);
                visited[j] = false;
            }
        }
    }
}
