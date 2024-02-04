class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c =='-' || c == '+' || c == '*'){
                String a = expression.substring(0,i);
                String b = expression.substring(i+1);
                List<Integer> al = diffWaysToCompute(a);
                List<Integer> bl = diffWaysToCompute(b);
                for(int x : al) {
                    for(int y : bl) {
                        if(c == '-'){
                            arr.add(x-y);
                        } else if(c == '+') {
                            arr.add(x+y);
                        } else if(c == '*') {
                            arr.add(x*y);
                        }
                    }
                }
            }
        }
        if(arr.size() == 0) arr.add(Integer.valueOf(expression));
        return arr;
    }
}

//matlab isme input jo h vo string ki form mein h aur jo output h vo Array ki form mein h 
//for ex - exp = "2-1-1"
//2 operations acc to the boardmass h yahan par ((2-1)-1) = 0 and (2-(1-1)) = 2
//expression consists of digits and the operator '+', '-', and '*'