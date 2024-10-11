class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        int lSum =0;
        for(int ele : nums){
            tSum += ele;
        }
        for(int i =0; i<nums.length; i++){
            
            if(lSum*2 == (tSum - nums[i])) return i;
            lSum += nums[i];
            
        }
        return -1; 
    }
}