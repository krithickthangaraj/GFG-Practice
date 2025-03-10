//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String s1, String s2){
        
        HashSet<Character> in=new HashSet<>();
        for(char i:s2.toCharArray()) in.add(i);
        
        StringBuilder inn=new StringBuilder();
        for(char i : s1.toCharArray())
        {
           if(!in.contains(i)) inn.append(i);
        }
        return inn.toString();

    }
}