class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles); //Sort the array in ascending order
        int n = piles.length;
        int count = 0;
        int i = n - 2; //start from the second last element 
        int res = 0;
        while(count != n / 3){
            res += piles[i]; //Add the second largest number in each step
            i -= 2; //Move two steps back to skip the smallest and pick the next second largest 
            count++; //Increment count after picking one for you
        }

        return res;
    }
}