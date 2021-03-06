/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assumption:
 * 1. -2^31 <= x <= 2^31 - 1
 */
public class ReverseInteger {

    /*
     * Time Complexity: When N stands for n digits in input integer, since we are going to loop scan all digits
     * so that the time complexity is O(N). However, the time complexity can also represent to O(logX) for integer X,
     * since there are roughly log10X digits in integer X.
     */
    public int reverse(int x) {
        int result = 0;
        while (Math.abs(x) > 0) {
            int pop = x % 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            result = result * 10 + (x % 10);
            x /= 10;
        }
        return result;
    }
}
