class Solution {
    public String compressedString(String word) {
        char[] arr = word.toCharArray();
        StringBuilder ans = new StringBuilder("");
        int i =0, j=0;
        while(j<arr.length){
            while(j<arr.length && arr[j] == arr[i]){
                j++;
            } 
            ;
            int len = j-i;
            while(len >9){
                ans.append(9);
                ans.append(arr[i]);
                len = len -9;
            }
            if(len >=1) ans.append(len);
            ans.append(arr[i]);
            i=j;
        }
       
        return ans.toString();

        
    }
}