import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private TwoSum testInstance = new TwoSum();

    @Test
    void twoSum() {
        int[] testInput = new int[]{3, 56, 34, 6, 5467, 7, 34, 5, 567};

        Assertions.assertArrayEquals(testInstance.twoSum(testInput, 12), new int[]{5, 7});
        Assertions.assertArrayEquals(testInstance.twoSum(testInput, 570), new int[]{0, 8});
        Assertions.assertArrayEquals(testInstance.twoSum(testInput, 234), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSum(testInput, -1), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSum(null, 234), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSum(new int[]{}, 234), new int[]{-1, -1});

    }

    @Test
    void twoSumImproved() {
        int[] testInput = new int[]{3, 56, 34, 6, 5467, 7, 34, 5, 567};

        Assertions.assertArrayEquals(testInstance.twoSumImproved(testInput, 12), new int[]{5, 7});
        Assertions.assertArrayEquals(testInstance.twoSumImproved(testInput, 570), new int[]{0, 8});
        Assertions.assertArrayEquals(testInstance.twoSumImproved(testInput, 234), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSumImproved(testInput, -1), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSumImproved(null, 234), new int[]{-1, -1});
        Assertions.assertArrayEquals(testInstance.twoSumImproved(new int[]{}, 234), new int[]{-1, -1});

    }


}