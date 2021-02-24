/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Assumption:
 * 1. Has exactly one solution
 * 2. Input / output numbers are in the Integer range
 * 3. no duplicate elements
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {


    /*
     * Time Complexity:
     * 1. Scan the original input array and push all elements into Hashmap: O(n)
     * 2. Scan the original input array and searching hashmap (O(1) per get request) for answers: O(n)
     * So total TC = O(2n) -> O(n)
     */
    public int[] twoSum(int[] nums, int target) {

        //sanity check
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> transfer = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            transfer.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (transfer.containsKey(target - element) && i != transfer.get(target - element)) {
                return new int[]{i, transfer.get(target - element)};
            }
        }

        return new int[]{-1, -1};
    }

}
