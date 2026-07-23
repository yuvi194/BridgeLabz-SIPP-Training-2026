import java.util.*;

public class NetworkConnectivity {

    static void dfsMark(
            Map<Integer, List<Integer>> network,
            int node,
            Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {
                dfsMark(network, neighbor, visited);
            }
        }
    }

    static int countNetworkSegments(
            Map<Integer, List<Integer>> network,
            int n) {

        Set<Integer> visited = new HashSet<>();

        int segments = 0;

        for (int server = 0; server < n; server++) {

            if (!visited.contains(server)) {

                segments++;

                dfsMark(network, server, visited);
            }
        }

        return segments;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> network = new HashMap<>();

        network.put(0, Arrays.asList(1));
        network.put(1, Arrays.asList(0));
        network.put(2, Arrays.asList(3));
        network.put(3, Arrays.asList(2));

        int segments = countNetworkSegments(network, 4);

        System.out.println("Segments = " + segments);

        if (segments == 1)
            System.out.println("Fully Connected");
        else
            System.out.println("Not Fully Connected");
    }
}