package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_Technique {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }


    public static void main(String[] args) {
        int v = 7;
        ArrayList<Graph.BFS_Technique.Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dfs(graph, curr, vis[]);
//        boolean vis[] = new boolean[v] ;
//        for(int i = 0 ; i < v ; i++){
//            if(vis[i] == false){
//                bfs(graph , v , vis , i );
//            }
//        }
        System.out.println();
    }

    private static void bfs(ArrayList<Edge>[] graph, int v, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.println(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Graph.BFS_Technique.Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.println(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, vis);
        }
        private static void createGraph(ArrayList<Edge>[] graph){
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 3));

            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
            graph[5].add(new Edge(5, 6));

            graph[5].add(new Edge(6, 5));
        }
    }
}

