//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        HashSet<Character> in=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder inn=new StringBuilder();
        for(char i: s.toCharArray())
        {
            if(in.contains(Character.toLowerCase(i))) inn.append(i);
        }
        return inn.length()==0? "No Vowel" : inn.toString();
    }
    
}
