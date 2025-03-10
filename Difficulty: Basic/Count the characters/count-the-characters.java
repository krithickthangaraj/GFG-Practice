//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
       int c=0;
       HashMap<Character,Integer> in=new HashMap<>();
       int prev=0;
       for(char curr: S.toCharArray())
       {
           
           if(curr!=prev)
           {
               in.put(curr,in.getOrDefault(curr,0)+1);
               
           }
           prev=curr;
       }
       for(Character x:in.keySet())
       {
            if(in.get(x)==N){
                c++;
            }
       }
            return c;
    }
}