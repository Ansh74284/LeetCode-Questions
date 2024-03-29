class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
            set.add(getReverse(num));
        }
        return set.size();
    }

    public int getReverse(int num){
        int res = 0;
        while(num!=0){
            res = res*10 + num%10;
            num /= 10;
        }
        return res;
    }
}