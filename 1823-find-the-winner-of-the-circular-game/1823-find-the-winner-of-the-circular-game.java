// Problem Description:
// Players in a Circle: There are 'n' players arranged in a circle.
// Elimination Rule: In each round, every 'k-th' player is eliminated from the circle. The counting wraps around the circle.
// Objective: Find and return the player number who survives and wins the game.

class Solution {
    public int findTheWinner(int n, int k) {
       return solve(n,k)+1;
    }
    public int solve(int n,int k)
    {
        if(n==1) //Base Case
            return 0; //There is only one player in the game
        return (solve(n-1,k)+k)%n; //Recursive Case
    }
}

// In the recursive case, we calculate the position of the next survivor in the smaller circle using the formula ((findWinner(n - 1, k) + k - 1) % n) + 1.
// findWinner(n - 1, k): Recursive call for the smaller circle.
// + k - 1: Skip 'k-1' players in the current circle.
// % n: Ensure the position is within the bounds of the current circle.
// + 1: Adjust the position to be 1-indexed

//The result of the recursive call gives the position of the winner in the current circle.

