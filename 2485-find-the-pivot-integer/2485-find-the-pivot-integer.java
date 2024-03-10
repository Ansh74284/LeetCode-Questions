class Solution {
    public int pivotInteger(int n) {
        int sum=(n*(n+1))/2;
        int sumr=0;
        for(int i=1;i<=n;i++){
            sumr=sumr+i;
            if(sum-sumr+i==sumr){
                return i;
            }
        }
        return -1;
    }
}
// sumleft=sum-sumright;