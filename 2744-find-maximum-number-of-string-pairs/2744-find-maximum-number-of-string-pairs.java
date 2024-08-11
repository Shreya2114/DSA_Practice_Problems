class Solution {
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
        
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count =0;
        for(int i =0; i<words.length; i++){
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }
            else set.add(words[i]);
        }
        return count;
    }
}