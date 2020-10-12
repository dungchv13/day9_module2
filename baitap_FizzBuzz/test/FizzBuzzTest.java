import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void display1() {
        int number = 21;
        String expected = "Fizz";

        String result = FizzBuzz.display1(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void display2() {
        int number = 25;
        String expected = "Buzz";

        String result = FizzBuzz.display1(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void display3() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.display1(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void display4() {
        int number = 17;
        String expected = "17";

        String result = FizzBuzz.display1(number);
        assertEquals(expected,result);
    }

}