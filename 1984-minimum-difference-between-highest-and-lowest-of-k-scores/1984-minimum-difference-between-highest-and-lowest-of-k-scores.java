class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = l+k-1;
        int diff = Integer.MAX_VALUE;
        while(r < nums.length) {
            diff = Math.min(diff, nums[r++] - nums[l++]);
        }
        return diff;
    }
}