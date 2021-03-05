import java.util.ArrayList;
import java.util.List;

/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on
 * a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * Assumption:
 * 1. 1 <= s.length <= 1000
 * 2. s consists of English letters (lower-case and upper-case), ',' and '.'
 * 1 <= numRows <= 1000
 */
public class ZigZagConversion {

    /*
     * Time Complexity: Since we loop scan all char in the input, for every scan, we only do simple O(1) calculation,
     * thus the time complexity is O(n)
     */
    public String convert(String s, int numRows) {

        // sanity check
        if (s.length() == 0 || s == null) {
            return "";
        }

        // corner case: if numsRow == 1, directly output the result
        if (numRows == 1) {
            return s;
        }

        // initial result ZigZag container
        List<StringBuilder> zigZagContainer = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            zigZagContainer.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean isGoingDown = false;
        for (int i = 0; i < s.length(); i++) {
            zigZagContainer.get(currentRow).append(s.charAt(i));
            //determine next row is going up or going down
            if (currentRow == 0) {
                isGoingDown = true;
            } else if (currentRow == numRows - 1) {
                isGoingDown = false;
            }
            currentRow += (isGoingDown) ? 1 : -1;
        }

        String result = "";
        for(StringBuilder i: zigZagContainer){
            result += i.toString();
        }
        return result;
    }

    public String convertImproved(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }

}
