import java.util.*;

public class Graph {

    public void grp() throws Exception {

        int b;
        System.out.println("Wecome to BFS And DFS Graph System");

        while (true) {
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for BFS\n");
            System.out.println("Press 2 for DFS\n");
            System.out.println("Press 3 for Return to Home\n");
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt();

            switch (b) {
                case 1:
                    Bfs();

                    break;
                case 2:
                    Dfs();
                    break;
                case 3:
                    App obj = new App();
                    App.main(new String[] {});
                    break;

                default:

                    break;
            }
            sc.close();

        }
    }

    public static void bfs(Map<Integer, List<Integer>> adjacencyList, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for (int neighbor : adjacencyList.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void Bfs() {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        // Add edges to the graph
        adjacencyList.put(0, Arrays.asList(1, 2));
        adjacencyList.put(1, Arrays.asList(0, 3, 4));
        adjacencyList.put(2, Arrays.asList(0, 5, 6));
        adjacencyList.put(3, Arrays.asList(1));
        adjacencyList.put(4, Arrays.asList(1));
        adjacencyList.put(5, Arrays.asList(2));
        adjacencyList.put(6, Arrays.asList(2));

        bfs(adjacencyList, 0);
    }

    public static void dfs(Map<Integer, List<Integer>> adjacencyList, int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.println(node);
            }

            for (int neighbor : adjacencyList.get(node)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void Dfs() {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        adjacencyList.put(0, Arrays.asList(1, 2));
        adjacencyList.put(1, Arrays.asList(0, 3, 4));
        adjacencyList.put(2, Arrays.asList(0, 5, 6));
        adjacencyList.put(3, Arrays.asList(1));
        adjacencyList.put(4, Arrays.asList(1));
        adjacencyList.put(5, Arrays.asList(2));
        adjacencyList.put(6, Arrays.asList(2));

        dfs(adjacencyList, 0);
    }

}