package Graph;
import java.io.*;
import java.util.*;

class Graph {
    private int V;   // No. of edge
    private LinkedList<Integer> adj[];

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void DFSUtil(int v,boolean visited[]) {
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
    public static void main(String args[]) {
        Graph g = new Graph(6); //edge quantity
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(0, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(2,5 );
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4,5 );
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 0)");
        g.DFS(0);
    }
}