import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    StringToInteger testInstance = new StringToInteger();

    @Test
    void myAtoi() {
        String input1 = "10";
        String input2 = "-10";
        String input3 = "0";
        String input4 = "10564";
        String input5 = "-10234";
        String input6 = "    -10234";
        String input7 = "words and 987";



        assertEquals(10, testInstance.myAtoi(input1));
        assertEquals(-10, testInstance.myAtoi(input2));
        assertEquals(0, testInstance.myAtoi(input3));
        assertEquals(10564, testInstance.myAtoi(input4));
        assertEquals(-10234, testInstance.myAtoi(input5));
        assertEquals(-10234, testInstance.myAtoi(input6));
        assertEquals(987, testInstance.myAtoi(input7));
    }
}