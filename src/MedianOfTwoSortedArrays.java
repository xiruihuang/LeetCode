/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * Assumptions:
 * 1. 0 <= input array1.length <= 1000
 * 2. 0 <= input array2.length <= 1000
 * 3. 1 <= inputArray1.length + inputArray2.length <= 2000
 * 4. -10^6 <= inputArray1[i], inputArray2[i] <= 10^6
 */
public class MedianOfTwoSortedArrays {


    /* Brute Force
     * Merge the input array, and find median using simple calculation
     *
     * Time Complexity: O(min(m,n)) which m is the length of input1 array,
     * and n is the length of input2 array.
     *
     * we merge two input array, which need loop scan two array.
     * median calculation is random access the array which only cost O(1)
     *
     *
     * Defect: use a new array to store merged array.
     * Improvement: we can use 4 pointers to simulate the find median in 2 array
     * 1. each input array will have 2 pointers points to head and tail
     * 2. we need loop num1.length + num2.length / 2 times, for each time,
     * we need to move 1 head pointer and 1 tail pointer. Then we compare
     * between the 2 head pointers and between 2 tail pointers to determine
     * which head and tail pointer should move, until reach to median
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //sanity check - array not exist
        if (nums1 == null || nums2 == null) {
            return -1;
        }

        //sanity check - array elements count
        if (nums1.length < 0 || nums2.length < 0 || nums1.length > 1000 || nums2.length > 1000) {
            return -1;
        } else if (nums1.length + nums2.length > 2000 || nums1.length + nums2.length < 1) {
            return -1;
        }

        int[] merge = mergeSortedLists(nums1, nums2);
        if(merge.length % 2 == 0){
            return ((double)(merge[merge.length / 2] + merge[(merge.length - 1) / 2])) / 2;

        } else {
            return merge[merge.length / 2];
        }

    }

    private int[] mergeSortedLists(int[] num1, int[] num2) {
        if (num1 == null || num2 == null) {
            return null;
        }

        int[] result = new int[num1.length + num2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        //merge by comparison
        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                result[k] = num1[i];
                i++;
                k++;
            } else {
                result[k] = num2[j];
                j++;
                k++;
            }
        }
        //move elements to result if num1 has some elements did not process
        while(i < num1.length){
            result[k] = num1[i];
            i++;
            k++;
        }
        //move elements to result if num2 has some elements did not process
        while(j < num2.length){
            result[k] = num2[j];
            j++;
            k++;
        }

        return result;
    }
}
