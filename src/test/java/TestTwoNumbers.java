import com.james.jenkinspipelines.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTwoNumbers {

    Main numbersMain;

    @Before
    public void setUp(){
        numbersMain = new Main();
    }

    @Test
    public void testSum(){
        Assert.assertEquals(14, numbersMain.sumOfNumbers(5, 8));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(13, numbersMain.subtractOfNumbers(21, 8));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(40, numbersMain.multiplyOfNumbers(5, 8));
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(5, numbersMain.divideOfNumbers(40, 8), 0.00);
    }

}
