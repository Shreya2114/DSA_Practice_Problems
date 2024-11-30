class Solution {
    public int strStr(String haystack, String needle) {
       
        int n = needle.length();
        if(n<=0) return -1;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}