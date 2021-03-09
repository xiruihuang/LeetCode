/*
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 * 1. Read in and ignore any leading whitespace.
 * 2. Check if the next character (if not already at the end of the string) is '-' or '+'.
 * Read this character in if it is either. This determines if the final result is negative or positive respectively.
 * Assume the result is positive if neither is present.
 * 3. Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
 * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
 * If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * 5.If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231,
 * and integers greater than 231 - 1 should be clamped to 231 - 1.
 * 6.Return the integer as the final result.
 */
public class StringToInteger {

    /*
     * Time Complexity: The following algorithm loop scan all Char in the input string, for each scan we do O(1) operation,
     * thus the overall time complexity is O(N)
     */
    public int myAtoi(String s) {
        //sanity check
        if (s == null || s.length() < 1) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                result = result * 10 + (s.charAt(i) - '0');
            }
        }

        return isNegativeNumber(s) * result;

    }

    private int isNegativeNumber(String s) {
        int i = 0;
        while(s.charAt(i) == ' '){
            i++;
        }
        return (s.charAt(i) == '-') ? -1 : 1;
    }


}
