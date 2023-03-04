package com.semester2.prakmodul4;

public class tugas2{
    public static void dijkstraAlgorithm(int[][] graph, int source){
        int count = graph.length;
        String alpha = "A";
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        //inisialisasi distance dan visitedVertex
        for (int i = 0; i < count; i++){
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }
        //inisialisasi nilai distance dengan indeks 0 = 0
        distance[source] = 0;
        for (int i = 0; i < count; i++){
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;
            for (int v = 0; v < count; v++){
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < 
                distance[v])){
                    //System.out.println(distance[u]);
                    distance[v] = distance[u] + graph[u][v];
                } 
            }
        }
        for (int i = 0; i < distance.length; i++){
            if(i == 0) alpha = "A";
            else if(i == 1) alpha = "B";
            else if(i == 2) alpha = "C";
            else if(i == 3) alpha = "D";
            else if(i == 4) alpha = "E";
            System.out.println(String.format("Distance from %s to %s is %s", 'A', alpha, 
            distance[i]));
        }
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex){
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
            for (int i = 0; i < distance.length; i++){
                if (!visitedVertex[i] && distance[i] < minDistance){
                    minDistance = distance[i];
                    minDistanceVertex = i;
                }
            }
        return minDistanceVertex;
    }
    public static void main(String[] args){
        int graph[][] = new int[][] { {0, 6, 0, 0, 7}, {6, 0, 5, -4, 8}, {0, -2, 0, 7, -3},
        {0, -4, 7, 0, 9}, {7, 8, -3, 9, 0} };
        tugas2 T = new tugas2();
        dijkstraAlgorithm(graph, 0);
    }
}