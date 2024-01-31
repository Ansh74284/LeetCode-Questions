class Solution {

    private static boolean isPalindromeHelper(String s, int l, int r) {
        
        if (l >= r) {
            return true;
        }
        if (String.valueOf(s.charAt(l)).equalsIgnoreCase(String.valueOf(s.charAt(r)))) {
            return isPalindromeHelper(s, l + 1, r - 1);
        }
        return false;
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return isPalindromeHelper(s, 0, s.length() - 1);
    }
}
