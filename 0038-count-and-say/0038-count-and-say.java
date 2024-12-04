class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        // to modify s
        String ans = "";
        int i =0, j=0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int  length =j-i;
                ans += length;
                ans += s.charAt(i);
                i = j;
            }
        } 
         int length =j-i;
         ans += length;
         ans += s.charAt(i);
         return ans;
    }
}