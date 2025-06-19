// User function Template for Java

class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        int l=0;
        int r=0;
        int max=0;
        int c=0;
        while(r<arr.length){
            if(arr[r]==0) c++;
           
            
            while(c>k){
                
                if(arr[l]==0) c--;
                l++;
            }
            max=Math.max(max,(r-l)+1);
            r++;

        }
        return max;
        
    }
}