class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       // HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // for(int ele : nums){
        //      map.put(ele, map.getOrDefault(ele, 0) + 1);
        // }
        //   for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == 2) {
        //         list.add(entry.getKey());
        //     }
        // }
        int n = nums.length;
        for(int i =0; i<n; i++){
            int idx = Math.abs(nums[i]) -1;
            if(nums[idx] > 0) nums[idx] *= -1;
            else list.add(idx+1);
        }
        return list;
    }
}