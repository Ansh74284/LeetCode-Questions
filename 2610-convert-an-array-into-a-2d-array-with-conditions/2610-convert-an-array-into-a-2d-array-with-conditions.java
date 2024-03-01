class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList <>();

        int freq[] = new int[nums.length + 1];

        for( int e : nums) {
            if(freq[e] >= ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(freq[e]).add(e);
            freq[e]++;
        }
        return ans;
    }
}