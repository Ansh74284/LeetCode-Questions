class Solution {
    public int minAddToMakeValid(String s) {
        //sabse pehle ek stack banana hoga
        Stack<Character> stack = new Stack<>();

        //iterate karwaenge pure string ko stack mein daalke element by element 
        for(int i=0; i<s.length(); i++){
            //check karenge ki string ka jo character hai stack mein present vo agar pair mein '()' valid nhi hua toh usko pop karenge and then valid parentheses ko dekhenge
            if(s.charAt(i)==')'){
            if(!stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
          }
          else{
              stack.push(s.charAt(i));
          }
        }
        return stack.size();
    }
}