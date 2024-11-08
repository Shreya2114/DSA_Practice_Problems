class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jSet = new HashSet<>();
        int count =0;
        
        for(int i =0;i< jewels.length(); i++){
            jSet.add(jewels.charAt(i));
        }
        for(int i =0; i<stones.length(); i++){
            if(jSet.contains(stones.charAt(i))) count++;
            
        }
        return count;
        
    }
}