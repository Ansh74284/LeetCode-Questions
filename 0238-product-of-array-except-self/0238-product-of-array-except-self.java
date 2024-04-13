class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixProd = 1;
        int suffixProd = 1;
        int[] ans = new int[nums.length];

        for(int i=0; i<n; i++){
            ans[i] = prefixProd;
            prefixProd *= nums[i];
        }
        for(int i=n-1; i>=0; i--){
            ans[i] *= suffixProd;
            suffixProd *= nums[i];
        }
        return ans;
    }
}