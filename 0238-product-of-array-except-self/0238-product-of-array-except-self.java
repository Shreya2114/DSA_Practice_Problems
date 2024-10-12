class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prfProduct = new int[n];
        prfProduct[0] = nums[0];
        for(int i =1; i<n; i++){
            prfProduct[i] = prfProduct[i-1]* nums[i];
        }
            int suffix = 1;
            for(int i =n-1; i>0; i--){
                prfProduct[i] = prfProduct[i-1] * suffix;
                suffix *= nums[i];
            }
            prfProduct[0] = suffix;
        
        return prfProduct;
    }
}