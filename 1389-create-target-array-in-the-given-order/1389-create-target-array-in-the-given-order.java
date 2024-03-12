class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            int k=nums[i];
            target.add(index[i], k);
        }
      //  int[] arr=target.toArray();
      int[] arr= new int[target.size()];
      for(int i=0;i<target.size();i++){
          arr[i]=target.get(i);
      }
        return arr;
    }
}