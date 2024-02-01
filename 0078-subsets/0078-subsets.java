class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //Base Case: if the array has only one element
        if(nums.length == 1)
        return new ArrayList<>(List.of(new ArrayList<>(), new ArrayList<>(List.of(nums[0]))));

        else{
            //Recursive Case
            int current = nums[0];

            //Recursively find subset for the rest of the array
            List<List<Integer>> preElement = subsets(Arrays.copyOfRange(nums, 1, nums.length));

            //create a new List to store the result
            List<List<Integer>> result = new ArrayList<>(preElement);

            //Iterate over the subsets obtained from the recursive call
            for(int k=0; k<preElement.size(); k++){
                //create a new list by adding the current element to each subset
                ArrayList<Integer> list = new ArrayList<>(preElement.get(k));
                list.add(current);

                //Add the new list to the result 
                result.add(list);
            }
            //Return the final Result
            return result;
        }
       
    }
}


//Now this is the Iterative Approach for this problem
//  class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         if(nums.length==1){
//             return new ArrayList<>(List.of(new ArrayList<>(), new ArrayList<>(List.of(nums[0]))));
//         }

//         List<List<Integer>> result=new ArrayList<>(List.of(new ArrayList<>()));
        
// HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();

//         for(int i=nums.length-1;i>=0;i--){

//             ArrayList<ArrayList<Integer>> bigBox=new ArrayList<>(List.of(new ArrayList<>(List.of(nums[i]))));

//             for(int j=i+1;j<nums.length;j++){
//                 ArrayList<ArrayList<Integer>> preElement=map.get(nums[j]);

//                 for(int k=0;k<preElement.size();k++) {
//                     ArrayList<Integer> list=new ArrayList<>(preElement.get(k));
//                     list.add(nums[i]);
//                     bigBox.add(list);
//                 }

//             }
//             map.put(nums[i],bigBox);
//         }

//         for(ArrayList<ArrayList<Integer>> outList: map.values()){
//             for(ArrayList<Integer> list:outList)
//                 result.add(list);
//         }

//         return result;
//     }
// }