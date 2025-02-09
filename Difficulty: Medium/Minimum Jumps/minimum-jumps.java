//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0; // Already at the last index
        if (arr[0] == 0) return -1; // Can't move forward

        int jumps = 1; // At least one jump is needed
        int maxReach = arr[0]; // The farthest we can reach
        int steps = arr[0]; // Steps we can still take

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // Reached the last index
            
            maxReach = Math.max(maxReach, i + arr[i]); // Update max reach
            steps--; // Use one step

            if (steps == 0) { // If no more steps left
                jumps++; // Increase jump count
                if (i >= maxReach) return -1; // If we are stuck, return -1
                steps = maxReach - i; // Reset steps for the new jump window
            }
        }

        return -1; // If we never reach the end
    }
}
