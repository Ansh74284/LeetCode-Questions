class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int i; int leftSum[] = new int[n]; int rightSum[] = new int[n];
        int prefix[] = new int[n]; int suffix[] = new int[n];

        //Create prefix and suffix in one iteration
        prefix[0] = nums[0];
        suffix[0] = nums[n-1];
        for(i=1; i<n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
            suffix[i] = suffix[i-1] + nums[n-i-1];
        }

        //get left and right sum
        for(i=0; i<n; i++) {
            leftSum[i] = prefix[i] - nums[i];
            rightSum[i] = suffix[n-i-1] - nums[i];
        }

        //final answer = nums[i] = |leftSum[i] - rightSum[i]|
        for(i=0; i<n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}