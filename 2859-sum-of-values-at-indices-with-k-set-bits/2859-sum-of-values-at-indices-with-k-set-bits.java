class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for(int i=0; i<nums.size(); i++)
            if(countBits(i)==k) res += nums.get(i);
            return res;
        
    }
    int countBits(int n) {
        int cnt = 0;
        while(n!=0){
            cnt+=(n&1);
            n=n>>1;
        }
        return cnt;
    }
}