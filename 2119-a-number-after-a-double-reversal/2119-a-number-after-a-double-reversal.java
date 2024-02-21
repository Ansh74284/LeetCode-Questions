class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int ans = 0;
        while(n!=0){
            int l = n%10;
            ans = (ans * 10) + l;
            n = n/10;
        }

        String s1 = Integer.toString(num);
        String s2 = Integer.toString(ans);
        if(s1.length() == s2.length()) return true;
        return false;
    }
}

// Step 1: Reverse the number and store it in a variable.
// Step 2: Take the two integers and convert it into String.
// Step 3: Check whether both of the string length is equal or not.
// Step 4: If it is equal return true, else return false.

//Time Complexity - O(n) and space complexity - O(n)