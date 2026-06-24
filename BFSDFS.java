
package exam;

import java.util.*;

public class BFSDFS {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static void bfs(int start) {

        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neigh : graph.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : graph.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(w);
            graph.get(w).add(u);
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        visited = new boolean[v];
        System.out.println("\nBFS Traversal:");
        bfs(start);

        visited = new boolean[v];
        System.out.println("\n\nDFS Traversal:");
        dfs(start);
    }
}