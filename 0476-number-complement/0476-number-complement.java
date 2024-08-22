class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        int bitLen = Integer.toBinaryString(num).length();
        int mask = (1<< bitLen) -1;
        return (num ^ mask);
        
    }
}