//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int solve(int n,int rem){
        if(n==0) return rem;
        return solve(n/10,rem*10+n%10);
    }
    public int reverseExponentiation(int n) {
        int pow=solve(n,0);
        return (int)Math.pow(n,pow);
        
    }
}
