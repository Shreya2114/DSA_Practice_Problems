class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            
        }
        for(int key:map.keySet()){
            int val = map.get(key);
            set.add(val);
        }
        return(map.size() == set.size());
    }
}