class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        String res = strs[0];
        for(int i=1; i<n; i++){
            while(strs[i].indexOf(res) != 0){
                res = res.substring(0,res.length()-1);

                if(res.isEmpty()){
                    return "";
                }
            }
        }
        return res;
    }
}