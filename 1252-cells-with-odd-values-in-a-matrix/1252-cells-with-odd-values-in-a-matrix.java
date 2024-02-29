class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int ans[][] = new int[m][n];
        for(int i=0; i<indices.length; i++) {

            int rowIdx = indices[i][0];
            int colIdx = indices[i][1];

            for(int j=0; j<n; j++) {
                ans[rowIdx][j] += 1;
            }

            for(int j=0; j<m; j++) {
                ans[j][colIdx] += 1;
            }
        }
        
        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}