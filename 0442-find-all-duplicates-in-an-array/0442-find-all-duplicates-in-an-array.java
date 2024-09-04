class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int ele : nums){
             map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
          for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}