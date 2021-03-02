import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays testInstance = new MedianOfTwoSortedArrays();

    @Test
    void findMedianSortedArrays() {
        int[] testCase1Input1 = new int[]{1,3};
        int[] testCase1Input2 = new int[]{2};

        int[] testCase2Input1 = new int[]{1,2};
        int[] testCase2Input2 = new int[]{3,4};

        int[] testCase3Input1 = new int[]{0,0};
        int[] testCase3Input2 = new int[]{0,0};

        int[] testCase4Input1 = new int[]{};
        int[] testCase4Input2 = new int[]{1};

        int[] testCase5Input1 = new int[]{2};
        int[] testCase5Input2 = new int[]{};



        assertEquals(2, testInstance.findMedianSortedArrays(testCase1Input1, testCase1Input2));
        assertEquals(2.5, testInstance.findMedianSortedArrays(testCase2Input1, testCase2Input2));
        assertEquals(0, testInstance.findMedianSortedArrays(testCase3Input1, testCase3Input2));
        assertEquals(1, testInstance.findMedianSortedArrays(testCase4Input1, testCase4Input2));
        assertEquals(2, testInstance.findMedianSortedArrays(testCase5Input1, testCase5Input2));

    }
}