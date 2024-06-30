class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<n; i++){
           
            sum += arr[i];
            
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum<0) sum =0;
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        
        return maxSum;

        
    }
}