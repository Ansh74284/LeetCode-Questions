class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int[] arr = new int[]{1,3,6,10,15,21,28};
        int k = 0;
        while(n>0){
            if(n < 8) {
                res += arr[n-1];
                res += k*n;
                n = 0;
            }
            else{
                n -= 7;
                res += arr[6];
                res += k*7;
                k+=1;
            }
        }
        return res;
    }
}