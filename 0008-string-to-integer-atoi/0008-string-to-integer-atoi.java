class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        return myAtoi(s, 0, -1, 0);
    }

    private int myAtoi(String s, int i, int sign, int result) {
        if(i >= s.length()) return result;

        char ch = s.charAt(i);
        if(sign != -1) {
            if(Character.isDigit(ch)) {
                int dig = ch - '0';
                if(sign == 1) {
                    if((result < Integer.MIN_VALUE / 10) || ((result == Integer.MIN_VALUE / 10) && dig >= 8))
                        return Integer.MIN_VALUE;
                    result = result * 10 - dig;
                    return myAtoi(s, i + 1, sign, result);
                }
                if((result > Integer.MAX_VALUE / 10) || ((result == Integer.MAX_VALUE / 10) && dig >= 7))
                    return Integer.MAX_VALUE;
                result = result * 10 + dig;
                return myAtoi(s, i + 1, sign, result);
            }
            return result;
        } else {
            if(ch >= '1' && ch <= '9') {
                int dig = ch - '0';
                if((result >= Integer.MAX_VALUE / 10) && dig >= 8)
                    return Integer.MAX_VALUE;
                result = result * 10 + dig;
                return myAtoi(s, i + 1, 0, result);
            }
            else if(ch == ' ') return myAtoi(s, i + 1, sign, result);
            else if(ch == '0') return myAtoi(s, i + 1, 0, result);
            else if(ch == '-') return myAtoi(s, i + 1, 1, result);
            else if(ch == '+') return myAtoi(s, i + 1, 0, result);
            else return result;
        }
    }
}

/*Remove leading and trailing whitespace characters from the input string.
Initialize variables i, sign, and result to keep track of the current position in the string, the sign of the number, and the intermediate result, respectively.
Recursively process the characters of the string:
Check the base case: If the current index i is beyond the string length, return the current result.
Retrieve the character at index i.
If the sign is not undetermined (i.e., -1), then:
Check if the character is a digit, and if so, update the intermediate result based on the sign and the digit.
Perform overflow checks to ensure the result stays within the range of a 32-bit signed integer.
Recur to the next index i+1.
If the sign is undetermined (i.e., 1 for - or 0 for +), then:
Determine the sign based on the current character.
If the character is a digit, update the intermediate result accordingly.
Recur to the next index i+1.
Return the final result.*/