import java.util.ArrayList;
import java.util.List;

class Solution {
    public void helper(int pos, int n, int[] nums, List<List<Integer>> ans) {
        // If we have reached the end of nums, we have found a Valid Permutation of nums
        if (pos >= n) {
            List<Integer> permutation = ConverttoArray(nums);
            ans.add(new ArrayList<>(permutation));
            return;
        }
        // Otherwise, we iterate over all the other elements and try to generate permutations by swapping the element at pos with the element at i
        for (int i = pos; i < n; i++) {
            // We create one unique permutation by swapping
            swap(pos, i, nums);
            // And we ask recursion to handle the rest of the task
            helper(pos + 1, n, nums, ans);
            // But after we come back, we must backtrack and undo the changes we have done
            swap(pos, i, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        // Swapping the elements
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> ConverttoArray(int[] nums) {
        // Converting the array into List
        List<Integer> ans = new ArrayList<>();
        for (int ele : nums)
            ans.add(ele);
        return ans;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums.length, nums, ans);
        return ans;
    }
}



//question hai permutation ka toh sabse pehle permutation ka formula dekh lete hai 
//Formula = nPr = n!/(n-r)!
//Ek array diya hua hai [1,2,3] = 3! = 3x2x1 = 6
//ex-2 [0,1] = 2! = 2x1 = 2

//for example there are three places -- -- --  triangle square circle
                                //   0  1  2  positions 
//toh yahan par jo h teeno shapes h sabko one by one rakhna h ek-ek places pe and ask recursion to permute the remaining part
//then swapping will also happen
//First task will be to bring the elements one by one to the current position which we will be define in the question.

/* The idea is to generate all Possible Permutations by swapping the nums[currentIndex] with nums[i]
As all the characters are Unique, the Permutations generated will also be Unique
We make neccessary changes in nums[] vector only. We don't use any other data structure
For Permutations, order doesn't matter

NOTE : In java there are no swap function so we need to create our own swap function

NOTE : The array must be converted into List before storing it in answer
*/

/*
Time Complexity  : O(N * N!)
Space Complexity : O(N)
*/