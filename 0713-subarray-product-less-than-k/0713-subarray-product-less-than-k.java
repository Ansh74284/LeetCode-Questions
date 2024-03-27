class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int s = 0, e = 0, prod = 1, ans = 0;
       while(e < nums.length){
        prod *= nums[e++]; //Include
        while(s < e && prod >= k) {
            prod /= nums[s++]; //exclude start
        }
        if(prod < k) {
            ans += e-s; //add to answer if it is valid 
        }
       }
       return ans; 
    }
}

//nums given array iya hua hai [10,5,2,6] ad k = 100 lekin output h vo 8 aa rha h 
//kyuki 8 total subarrays onge jiske product less than 100 honge
//[10],[5],[2],[6],[10,5],[5,2],[2,6],[5,2,6]

