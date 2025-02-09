//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static char nonRepeatingChar(String s) {
        int[] freq = new int[256]; // ASCII character frequency
        for (char c : s.toCharArray()) {
            freq[c]++; // Count occurrences
        }
        
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c; // First non-repeating character
            }
        }
        
        return '$'; // If no non-repeating character found
    }
}

