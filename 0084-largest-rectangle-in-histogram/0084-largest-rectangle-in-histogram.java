class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        // calculating nse(next smaller element)
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2; i>=0; i--){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        
//         emptying stack
        while(st.size()>0) st.pop();
        
//         calculating pse(previous smaller element)
        st.push(0);
        pse[0] = -1;
        for(int i =1; i<n; i++){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
//         Calculating maximum area
        int max = -1;
        for(int i =0; i<n; i++){
            int area = heights[i]*(nse[i] - pse[i] -1);
            max = Math.max(area,max);
        }
        return max;
    }
}