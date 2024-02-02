class Solution {
    public int fib(int n) {
        //Base Case
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        //Recusrive Case 
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}

//fibbonacci Number toh vo hote h like 0 1 1 2 3 5 8 13....
//fib(0) = 0, fib(1) = 1 , fib(2) = 1
//fib(2) = fib(1) + fib(0) = 1+0 = 1