class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo =0;
        int hi = n-1;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]) lo = mid +2;
                else hi = mid;
            }
            else{
                if(nums[mid] == nums[mid-1]) lo = mid +1;
                else hi = mid;
            }

        }
        return nums[lo];
    }
}