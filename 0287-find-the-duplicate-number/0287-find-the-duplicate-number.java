class Solution {
    public int findDuplicate(int[] arr) {
//         ************** Time limit exceeded error *************
        // int n = arr.length;
        // int rep =0;
        // for(int i =0; i<n-1; i++){
        //     int repeat = arr[i];
        //     for(int j = i+1; j<n; j++){
        //         if(repeat == arr[j]){
        //             rep = arr[j];
        //             break;
        //         }
        //     }
        //     if(repeat == rep) break;
        // }
        // return rep;
//         ***************************************************************
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(ele)){
                return ele;
            }
            set.add(ele);
        }
        return -1;
        
    }
}