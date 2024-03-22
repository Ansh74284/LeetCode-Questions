class Solution {
    public int numberOfBeams(String[] bank) {
        int a = 0, b = 0, ans = 0, count = 0;
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1')
                    count++;
            }

            if (count != 0) {
                b = a;
                a = count;
                count = 0;
            }
            if (a != 0 && b != 0) {
                ans += a * b;
                b = 0;
            }
        }
        return ans;
    }
}