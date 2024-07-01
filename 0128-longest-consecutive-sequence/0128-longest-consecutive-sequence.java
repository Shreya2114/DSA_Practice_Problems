class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        
        int longestSeq = 1;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(nums[i]);
        }
        for(int ele:set){
            if(!set.contains(ele - 1)){
                int count =1;
                int x = ele;
                    while(set.contains(x+1)){
                        x = x+1;
                        count = count + 1;
                        
                    }
                longestSeq = Math.max(longestSeq, count);
                
            }
        }   
        return longestSeq;
        
    }
}