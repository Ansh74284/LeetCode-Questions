class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // again, put it into a hashmap by element: frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }


        // each index of arr represents the frequency
        // each element of arr has a list that stores all the elements
        // with the same frequencies

        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = new ArrayList<>();

        // we sort it by frequency in O(n) time
        for (Integer i: map.keySet()) arr[map.get(i)].add(i);
        

        // final array
        int[] res = new int[k];
        int idx = 0;

        // put the top k elements of arr
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].size(); j++) {

                // if idx == k, we fulfilled all the elements
                if (idx == k) return res;
                res[idx++] = arr[i].get(j);
            }
        }

        return res;



    }
}