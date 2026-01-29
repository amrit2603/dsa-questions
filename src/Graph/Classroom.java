package Graph;


import java.util.ArrayList;

public class Classroom {
    public static class Edge{
        int src ;
        int dest;
        int wt;

        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        printGraph(graph);
    }

    static void printGraph(ArrayList<Edge>[] graph) {
        for(int i = 0 ;i < graph.length ; i++){
            for(int j = 0 ; j < graph[i].size() ; j++){
                Edge edge = graph[i].get(j);
                System.out.print(edge.src +":"+ edge.dest +":" + edge.wt +" ");
            }
            System.out.println();
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0 ;i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2 , 2));
        graph[1].add(new Edge(1,2 , 10));
        graph[1].add(new Edge(1,3 , 0));
        graph[2].add(new Edge(2,0 , 2));
        graph[2].add(new Edge(2,1 , 10));
        graph[2].add(new Edge(2,3 , -1));
        graph[3].add(new Edge(3,1 , 0));
        graph[3].add(new Edge(3,2 , -1));

    }



}
