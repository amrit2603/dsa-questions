package Graph;

import java.util.ArrayList;

public class CreateGraph {
    static class Edge{
        int src ;
        int dest ;

        public Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        transverseGraph(graph);
    }

    private static void transverseGraph(ArrayList<Edge>[] graph) {
        for(int i = 0 ; i < graph.length ; i++){
            for(int j = 0 ; j <graph[i].size() ; j++){
                System.out.println(graph[i].get(j).src + ":" + graph[i].get(j).dest  );
            }
        }
    }

    private static void creategraph(ArrayList<Edge>[] graph) {
        for(int i = 0 ;i < graph.length ; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2 ));
        graph[1].add(new Edge(1,2 ));
        graph[1].add(new Edge(1,3 ));
        graph[2].add(new Edge(2,0 ));
        graph[2].add(new Edge(2,1 ));
        graph[2].add(new Edge(2,3 ));
        graph[3].add(new Edge(3,1 ));
        graph[3].add(new Edge(3,2 ));
    }
}
