import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void classifier1() {
        TriangleClassifier t1 = new TriangleClassifier(2,2,2);
        String expect = "TAM GIAC DEU";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
    @org.junit.jupiter.api.Test
    void classifier2() {
        TriangleClassifier t1 = new TriangleClassifier(2,2,3);
        String expect = "TAM GIAC CAN";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
    @org.junit.jupiter.api.Test
    void classifier3() {
        TriangleClassifier t1 = new TriangleClassifier(3,4,5);
        String expect = "TAM GIAC THUONG";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
    @org.junit.jupiter.api.Test
    void classifier4() {
        TriangleClassifier t1 = new TriangleClassifier(8,2,3);
        String expect = "KHONG PHAI LA TAM GIAC";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
    @org.junit.jupiter.api.Test
    void classifier5() {
        TriangleClassifier t1 = new TriangleClassifier(-1,2,1);
        String expect = "KHONG PHAI LA TAM GIAC";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
    @org.junit.jupiter.api.Test
    void classifier6() {
        TriangleClassifier t1 = new TriangleClassifier(0,1,1);
        String expect = "KHONG PHAI LA TAM GIAC";

        String result = t1.classifier();
        assertEquals(expect,result);
    }
}