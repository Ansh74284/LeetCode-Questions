class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            for(int[] point : points){
                int a = point[0];
                int b = point[1];

                if(Math.pow(x-a,2) + Math.pow(y-b,2) <= Math.pow(r,2)){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}

//Time Complexity - O(N^2)