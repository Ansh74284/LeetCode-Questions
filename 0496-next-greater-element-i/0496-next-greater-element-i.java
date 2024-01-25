//class Solution {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        for(int i = 0; i < nums1.length; i++){
//            int max = -1;
//            for(int j = 0; j < nums2.length; j++){
//                int index = j;
//                if(nums1[i] == nums2[j]){ // Found element in nums2 that matches current element in nums1
//                    while(index != nums2.length){ // Iterate through remaining elements in nums2 to find next greater element
//                        if(nums2[index] > nums1[i]){
//                            max = nums2[index]; // Update max if we find a greater element
//                            break;
//                        }
//                        index++;
//                    }
//                }
//            }
//            ans[i] = max;
//        }
//        return ans;
//    }
//}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map for next greater element
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) { // Pop elements from stack and update map with next greater element
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }
}