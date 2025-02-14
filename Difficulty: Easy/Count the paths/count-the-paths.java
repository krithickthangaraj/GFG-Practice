//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for (int i = 0; i < m; i++) {
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution
{
    public int countPath(List<List<Integer>> l,int s,int d){
        if(s==d){
            return 1;
        }
        int count=0;
        for(int v : l.get(s)){
            count+=countPath(l,v,d);
        }
        return count;
    }
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here 
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        
        for(int[] e : edges){
            int u=e[0];
            int v=e[1];
            l.get(u).add(v);
        }
        
        return countPath(l,s,d);
    }
}

