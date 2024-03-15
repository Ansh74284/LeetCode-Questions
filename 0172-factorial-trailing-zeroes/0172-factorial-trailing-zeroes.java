class Solution {
    public int trailingZeroes(int n) {
        if(n < 5) return 0;
        return n/5 + trailingZeroes(n/5);
        
    }
}

/* the amount of trailing zeroes in a number is equal to the amount of (2*5)s combination 
we can have ex1: n=120 = 1x2x3x4x5 ek hi combination 2*5 ka so 1 trailing zero 
we can a=have n = 3628800 = 1x2x3x4x5x6x7x8x9x10 here we have of 2*5 ke 2 combinations hai so 2 trails 

now suppose karte hai ki n=25 => 25! = --------------0000000
25/5 = 5
5/5 = 1
1/5 = 0
=> 5+1+0 = 6 zeroes
*/