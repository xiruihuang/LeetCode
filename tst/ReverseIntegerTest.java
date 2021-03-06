import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger testInstance = new ReverseInteger();

    @Test
    void reverse() {
        int testInput1 = -123;
        int testInput2 = 123;
        int testInput3 = 1;
        int testInput4 = 0;

        assertEquals(-321, testInstance.reverse(testInput1));
        assertEquals(321, testInstance.reverse(testInput2));
        assertEquals(1, testInstance.reverse(testInput3));
        assertEquals(0, testInstance.reverse(testInput4));

    }
}