// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int sum=0;
        int l=0,r=0;
        int max=0;
        while(r<arr.length){
            sum+=arr[r];
            if((r-l)+1==k) 
            
            {
                max=Math.max(sum,max);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return max;
    }
}