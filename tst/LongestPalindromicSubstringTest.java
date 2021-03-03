import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring testInstance = new LongestPalindromicSubstring();

    @Test
    void longestPalindrome() {
        String testInput1 = "babad";
        String testInput2 = "cbbd";
        String testInput3 = "a";
        String testInput4 = "ac";

        assertEquals("bab", testInstance.longestPalindrome(testInput1));
        assertEquals("bb", testInstance.longestPalindrome(testInput2));
        assertEquals("a", testInstance.longestPalindrome(testInput3));
        assertEquals("a", testInstance.longestPalindrome(testInput4));
    }
}