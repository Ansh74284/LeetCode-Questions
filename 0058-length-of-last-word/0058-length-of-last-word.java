class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else if(length > 0){
                break;
            }
        }
        return length;
    }
}

//Approach 
/* to solve this problem, we need to find the last word in the string and return its length. We can acheive this by
splitting the string into words and then returning the length of the last word.*/
/*strip trailing whitespaces from the input string using the strip()method.
split the string into words using the split() method.
if there are no words after stripping whitespaces, return 0.
Otherwise, return the length of the last word, which is the last element in the list of words.*/