class Solution {
    public String decodeString(String s) {
        Stack<String> wordstk = new Stack<String>();   //to store characters present in the string
        Stack<Integer> intstk = new Stack<Integer>();  //to store integer values present in the string
        StringBuilder temp = new StringBuilder();  //storing the string
        int number = 0;   //stores the number of times temp has to be duplicated
        for(int i = 0; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))    number = number * 10 + (c - '0');   //goes over digitwise and gives the number
            else if(Character.isLetter(c)) temp.append(c);
            else if(c == '[')   // denotes the start of another encoded string, so add temp and number to their respective stacks
            {
                intstk.add(number);
                wordstk.add(temp.toString());
                number = 0;
                temp = new StringBuilder();
            }
            else
            {
                int count = intstk.pop();
                StringBuilder dupe = new StringBuilder(wordstk.pop());
                for(int j = 1; j <= count;j++)    dupe.append(temp);
                temp = dupe;
            }
		}
        return temp.toString();
    }
}