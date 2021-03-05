import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {

    ZigZagConversion testInstance = new ZigZagConversion();

    @Test
    void convert() {
        String input1 = "PAYPALISHIRING";
        String input2 = "A";

        assertEquals("PAHNAPLSIIGYIR", testInstance.convert(input1, 3));
        assertEquals("PINALSIGYAHRPI", testInstance.convert(input1, 4));
        assertEquals("A", testInstance.convert(input2, 1));
    }
    @Test
    void convertImproved() {
        String input1 = "PAYPALISHIRING";
        String input2 = "A";

        assertEquals("PAHNAPLSIIGYIR", testInstance.convertImproved(input1, 3));
        assertEquals("PINALSIGYAHRPI", testInstance.convertImproved(input1, 4));
        assertEquals("A", testInstance.convertImproved(input2, 1));
    }
}