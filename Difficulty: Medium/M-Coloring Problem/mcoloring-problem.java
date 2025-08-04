import java.util.*;

class Solution {
    
    // Function to check if it is safe to color the node with color c
    private boolean isSafe(int node, List<Integer>[] adj, int[] color, int c) {
        for (int neighbour : adj[node]) {
            if (color[neighbour] == c) {
                return false;
            }
        }
        return true;
    }
    
    // Backtracking function
    private boolean solve(int node, List<Integer>[] adj, int[] color, int m, int v) {
        if (node == v) return true;
        
        for (int c = 1; c <= m; c++) {
            if (isSafe(node, adj, color, c)) {
                color[node] = c;
                if (solve(node + 1, adj, color, m, v)) return true;
                color[node] = 0; // backtrack
            }
        }
        return false;
    }
    
    // Main function
    boolean graphColoring(int v, int[][] edges, int m) {
        // Create adjacency list
        List<Integer>[] adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
        
        // Build the graph from edge list
        for (int[] edge : edges) {
            int u = edge[0], w = edge[1];
            adj[u].add(w);
            adj[w].add(u); // undirected graph
        }
        
        int[] color = new int[v];
        return solve(0, adj, color, m, v);
    }
}
