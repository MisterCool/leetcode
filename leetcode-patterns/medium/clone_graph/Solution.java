package clone_graph;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Solution {

    public Node cloneGraph(Node node) {
        if(node == null) return node;

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(node);

        Map<Node, Node> map = new HashMap<>();

        while(!queue.isEmpty()) {
            Node poll = queue.poll();



            if(map.containsKey(poll)) continue;

            Node clone = new Node(poll.val);

            for(Node n: poll.neighbors) {
                clone.neighbors.add(new Node(n.val));

                queue.add(n);
            }
            map.put(poll, clone);
        }

        return map.get(node);
    }
}
