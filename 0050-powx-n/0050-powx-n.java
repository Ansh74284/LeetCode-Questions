class Solution {
    public double myPow(double x, int n) {
        if(n < 0) return 1 / po(x, -1*n);
        return po(x, n);
    }

    double po(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        double half = po(x, n/2);
        if(n % 2 == 0) {
            return half * half;
        }
        else {
            return x * half * half;
        }
    }
}