class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while(temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x < 0 || (x != 0 && x % 10 == 0)) {
//             return false;
//         }

//         int reversed = 0;
//         int original = x;

//         while (x > reversed) {
//             reversed = reversed * 10 + x % 10;
//             x /= 10;
//         }

//         return (x == reversed) || (x == reversed / 10);
//     }
// }