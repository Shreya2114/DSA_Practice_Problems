class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length; 
        int k = 1;
        for(int i =1; i<n; i++){
            if(arr[i]!= arr[k-1]){
                arr[k] = arr[i];
               
                k++;
            }
        }
        return k;    
    }
}