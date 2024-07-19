class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> rowMin = new ArrayList<>();
        ArrayList<Integer> colMax = new ArrayList<>();
        ArrayList<Integer> luckyNo = new ArrayList<>();
         for(int i =0; i<m; i++){
            int rMin = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                rMin = Math.min(matrix[i][j], rMin);
            }
            rowMin.add(rMin);
        }
        for(int j =0; j<n; j++){
            int cMax = Integer.MIN_VALUE;
            for(int i=0; i<m; i++){
                cMax = Math.max(matrix[i][j], cMax);
            }
            colMax.add(cMax);
        }
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
               if((matrix[i][j] == rowMin.get(i)) && (matrix[i][j] == colMax.get(j))){
                   luckyNo.add(matrix[i][j]);
               }
            } 
        }
        return luckyNo;
        
        
        
    }
}