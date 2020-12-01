package hu.devenv.test.java;

import hu.devenv.java.SquareCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void checkMultiplication() {
        SquareCount test = new SquareCount();
        System.out.println("======TEST STARTED=======");
        Assertions.assertTrue(!Double.isNaN(3.00),"!Double.isNaN(3.00) test success");
        Assertions.assertTrue(!Double.isNaN(5.00),"!Double.isNaN(5.00) test success");
        Assertions.assertEquals(15.00, test.count(3.00,5.00),"test.count(3.00, 5.00) test success");
        System.out.println("======TEST ENDED=======");
    }
}