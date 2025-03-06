//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> in=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{')
            {
                in.push(c);
            }
            else {
                if(in.isEmpty()) return false;
            
            
            char top=in.peek();
            if(c==')' && top=='(' ||
            c==']' && top=='[' ||
            c=='}' && top=='{')
            {
                in.pop();
            }
            else return false;
            }
        }
        return in.isEmpty();
        
}
}
