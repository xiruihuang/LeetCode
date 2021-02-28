import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters testInstance = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s3 = "";

        assertEquals(3, testInstance.lengthOfLongestSubstring(s));
        assertEquals(1, testInstance.lengthOfLongestSubstring(s1));
        assertEquals(3, testInstance.lengthOfLongestSubstring(s2));
        assertEquals(0, testInstance.lengthOfLongestSubstring(s3));
    }

    @Test
    void lengthOfLongestSubstringImproved() {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s3 = "";

        assertEquals(3, testInstance.lengthOfLongestSubstringImproved(s));
        assertEquals(1, testInstance.lengthOfLongestSubstringImproved(s1));
        assertEquals(3, testInstance.lengthOfLongestSubstringImproved(s2));
        assertEquals(0, testInstance.lengthOfLongestSubstringImproved(s3));
    }
}