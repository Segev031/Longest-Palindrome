class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;
        int len = 0;
        boolean odd = false;
        for (int c: count) {
            len += (c / 2) * 2;
            if (odd) 
                continue;
            if (c % 2 == 1)
                odd = true;
        }
        if (odd)
            return len + 1;
        return len;
    }
}