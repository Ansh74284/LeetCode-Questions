class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);


        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

//array ek given h hume is question mein nums[] contains n+1 integers where eache integer is the range [1,n] inclusive
//given array mein jo number bhi ek se zyada baar repeat ho rha h toh usko return karwana hai 
//i think u got the point over here 
//input = [1,3,4,2,2]
//output: 2
/*do pointer allot karte hai ek slow aur ek fast 
slow ek-ek karke traverse karega values arrays ki 
fast jo hai vo do karke traverse karega aur dekhega ki agar value jo slow pointer pe present h aur current fast mein h toh wahi return karwa denge */
