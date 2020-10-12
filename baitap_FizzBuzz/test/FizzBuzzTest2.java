import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest2 {

    @Test
    void display20() {
        int number = 13589;
        String expected = "FizzBuzz";

        String result = FizzBuzz.display2(number);
        assertEquals(expected,result);
    }
    @Test
    void display21() {
        int number = 589;
        String expected = "Buzz";

        String result = FizzBuzz.display2(number);
        assertEquals(expected,result);
    }
    @Test
    void display22() {
        int number = 1389;
        String expected = "Fizz";

        String result = FizzBuzz.display2(number);
        assertEquals(expected,result);
    }
    @Test
    void display23() {
        int number = 189;
        String expected = "";

        String result = FizzBuzz.display2(number);
        assertEquals(expected,result);
    }
}