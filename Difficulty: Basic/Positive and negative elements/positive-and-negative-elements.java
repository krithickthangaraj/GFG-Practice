//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();

            v = new Solution().arranged(array1);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
       int []a=new int[arr.size()];
       int i=0;
       int j=1;
       for(int s:arr)
       {
           if(s>0)
           {
               a[i]=s;
               i+=2;
           }else{
               a[j]=s;
               j+=2;
           }
       }
        ArrayList<Integer> sc=new ArrayList<>();
        for(int k=0;k<a.length;k++)
        {
            sc.add(a[k]);
            
        }
        return sc;
    }
}
