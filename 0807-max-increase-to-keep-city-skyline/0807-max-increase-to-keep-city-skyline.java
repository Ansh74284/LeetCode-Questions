class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int arr1[] = new int [n];
        int arr2[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr2[i] < grid[i][j]) arr2[i] = grid[i][j];
                if(arr1[j] < grid[i][j]) arr1[j] = grid[i][j];
            }
        }
        int ans = 0;
        int m = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m = Math.min(arr2[i],arr1[j]);
                if(grid[i][j]<m) ans+=(m-grid[i][j]);
            }
        }
        return ans;
    }
}