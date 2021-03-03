/*
 * Given a string s, return the longest palindromic substring in s.
 *
 * Assumption:
 * 1. 1 <= s.length <= 1000
 * 2. s consist of only digits and English letters (lower-case and/or upper-case),
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        //sanity check
        if (s == null || s.length() == 0) {
            return "";
        }
        int resultStart = 0;
        int resultEnd = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddCenterLen = expendFromCenter(s, i, i);
            int evenCenterLen = expendFromCenter(s, i, i + 1);
            int len = Math.max(oddCenterLen, evenCenterLen);
            if(len > (resultEnd - resultStart + 1)){
                resultStart = i - (len - 1) / 2;
                resultEnd = i + len / 2;
            }
        }
        return s.substring(resultStart, resultEnd + 1);

    }

    private int expendFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
