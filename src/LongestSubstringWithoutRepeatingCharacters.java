import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Assumptions:
 * 1. 0 <= s.length <= 5 * 104
 * 2. s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /*
     * Time Complexity: for the worse case, we need to go over the array twice (both 2 pointers)
     * so the time complexity is O(n)
     */
    public int lengthOfLongestSubstring(String s) {

        // sanity check
        if (s == null || s.length() < 1) {
            return 0;
        }

        int max = 0;
        Map<Character, Integer> deDuplication = new HashMap<>();

        int slow = 0;
        int fast = 0;

        while (fast < s.length()) {
            if (!deDuplication.containsKey(s.charAt(fast))) {
                deDuplication.put(s.charAt(fast), fast);
                fast++;
                max = Math.max(max, s.substring(slow, fast).length());
            } else {
                deDuplication.remove(s.charAt(slow));
                slow++;
            }
        }
        return max;
    }


    /*
     * We can just go through the array once and update the location for the social character
     * so the TC = O(n)
     */
    public int lengthOfLongestSubstringImproved(String s) {

        // sanity check
        if (s == null || s.length() < 1) {
            return 0;
        }

        Map<Character, Integer> deDuplication = new HashMap<>();
        int result = 0;
        for (int fast = 0, slow = 0; fast < s.length(); fast++) {
            if (deDuplication.containsKey(s.charAt(fast))) {
                slow = Math.max(deDuplication.get(s.charAt(fast)), slow);
            }
            result = Math.max(result, fast - slow + 1);
            deDuplication.put(s.charAt(fast), fast + 1);
        }
        return result;
    }

}

