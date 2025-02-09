//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
        StringBuilder sb = new StringBuilder();
        int[] frequency = new int[255];
        Arrays.fill(frequency,0);
        int n= str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(frequency[ch]==0){
                sb.append(ch);
                frequency[ch]++;
            }
        }
        return sb.toString();
    }
}