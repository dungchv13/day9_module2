import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest3 {

    @Test
    void display31() {
        int number = 0;
        String expected = "SO BAN NHAP KO THOA MAN!";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
    @Test
    void display32() {
        int number = 5;
        String expected = "NAM";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
    @Test
    void display33() {
        int number = 10;
        String expected = "MUOI ";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
    @Test
    void display34() {
        int number = 12;
        String expected = "MUOI HAI";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
    @Test
    void display35() {
        int number = 27;
        String expected = "HAI BAY";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
    @Test
    void display36() {
        int number = 90;
        String expected = "CHIN MUOI";

        String result = FizzBuzz.display3(number);
        assertEquals(expected,result);
    }
}