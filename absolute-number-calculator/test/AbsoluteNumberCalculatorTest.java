import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
    @Test
    void findAbsolute1() {
        int number = 5;
        int expected = 5;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
    @Test
    void findAbsolute2() {
        int number = -5;
        int expected = 5;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result,expected);
    }
}