import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

//    @org.junit.jupiter.api.Test
//    void isLeapYear() {
//        int year = 1700;
//        boolean expected = false;
//
//        boolean result = NextDayCalculator.isLeapYear(year);
//        assertEquals(result,expected);
//    }

    @Test
    void getNextDay0() {
        NextDayCalculator test1 = new NextDayCalculator(1,1,2018);
        String expected = "ngay: 2\nthang: 1\nnam: 2018";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }
    @Test
    void getNextDay1() {
        NextDayCalculator test1 = new NextDayCalculator(31,1,2018);
        String expected = "ngay: 1\nthang: 2\nnam: 2018";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }
    @Test
    void getNextDay2() {
        NextDayCalculator test1 = new NextDayCalculator(30,4,2018);
        String expected = "ngay: 1\nthang: 5\nnam: 2018";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }
    @Test
    void getNextDay3() {
        NextDayCalculator test1 = new NextDayCalculator(28,2,2018);
        String expected = "ngay: 1\nthang: 3\nnam: 2018";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }
    @Test
    void getNextDay4() {
        NextDayCalculator test1 = new NextDayCalculator(29,2,2020);
        String expected = "ngay: 1\nthang: 3\nnam: 2020";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }
    @Test
    void getNextDay5() {
        NextDayCalculator test1 = new NextDayCalculator(31,12,2018);
        String expected = "ngay: 1\nthang: 1\nnam: 2019";

        String result = test1.getNextDay();
        assertEquals(expected,result);
    }

}