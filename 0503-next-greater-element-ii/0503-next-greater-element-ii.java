class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1); //Arrays.fill() ka matlab hai ans array mein -1 hi store hoga jab tak nums.length hai

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<2*nums.length; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i % nums.length]){
                ans[st.pop()] = nums[i % nums.length];
            }


            if(i < nums.length) {
                st.push(i);
            }
        }
        return ans;
    }
}

//BruteForce approach Time Complexity O(n^2)
//sabse pehle hum ek circular Array banayenge which means given array ko add up karke for ex [1,2,1][1,2,1] 
//ki form mein likhenge and then for each elementwe will go through to search all element to next greatest element

//Now the efficient way is By doing it with Stack
//Agar ek Array For Ex- [1,4,3,2,5,1] toh 4 pe gradual increase ho rha h then value decrease hote jaaa rhi hai
//fir 5 pe increase ho rhi h aur fir 1 pe decrease ho rhi h 
//Jab bhi aisa gradual inc aur dec wala case ya question aa jaae toh Stack ka hi use karenge question.
//toh pehle stack mein 1 ko push karenge next 4 usse bada hai toh 1 pop ho jaaega aur 4 ko stack mein push kar denge
//aur ans mein 1 ka next greatest 4 store ho jaaega 
//then aise hi 3 ko aur 2 ko push kiya (2 is less than 3) next 5 greatest h toh 2 aur 3 ko pop kar diya and 
//4 ko bhi pop kardo cause (4<5) and ans array mein 2,3,4 ka greatest 5 ho jaaega
//last mein 1 hai aur uska greatest nhi h kuchh toh -1 store kar denge stack mein. 
//ans will be [4,5,5,5,-1]