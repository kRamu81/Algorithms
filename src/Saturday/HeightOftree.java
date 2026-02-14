
// solving the problem taking Dynamically using BFS

import java.util.*;

public class HeightOftree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Adjacency List
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        // BFS from root node 1
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];

        queue.add(1);
        visited[1] = true;

        int height = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            height++; // Each level increases height

            for (int i = 0; i < size; i++) {
                int node = queue.poll();

                for (int neighbor : tree.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }

        System.out.println(height);
    }
}

