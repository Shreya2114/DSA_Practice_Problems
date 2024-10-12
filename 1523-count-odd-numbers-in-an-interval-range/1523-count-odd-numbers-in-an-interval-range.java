class Solution {
    public int countOdds(int low, int high) {
        int nos = high - low +1;
        if(low %2 !=0 && high%2 != 0) return nos/2+1;
        return nos/2;
        
    }
}