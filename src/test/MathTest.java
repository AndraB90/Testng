package test;

import classes.Math;
import org.testng.Assert;
import org.testng.annotations.*;

public class MathTest {

    Math m;

    @BeforeMethod
    public void createObject() {
        m = new Math();
        System.out.println("Object is created");

    }

    @AfterMethod
    public void destroyObject() {
        System.out.println("Object is destroyed");
    }

    @Test
    public void addTest() {

        // Arrange
        //Math m = new Math();

        // Act
        int result = m.add(1, 2);

        // Assert
        Assert.assertEquals(result, 3, "The result is not correct");
    }

    @Test
    public void multiplyTest() {

        int result = m.multiply(1, 2);

        Assert.assertEquals(result, 2);
    }

    @Test
    public void findMaxTest() {

        int result = m.findMax(2, 3);

        Assert.assertEquals(result, 3);
    }

    @Test
    public void isEvenOrOddWhenArgumentIsEvenTest() {

        String result = m.isEvenOrOdd(4);

        Assert.assertEquals(result, "Is even");
    }

    @Test
    public void isEvenOrOddWhenArgumentIsOddTest() {

        String result = m.isEvenOrOdd(3);

        Assert.assertEquals(result, "Is odd");
    }

    @Test
    public void isPositive() {

        boolean result = m.isPositive(2);

        Assert.assertTrue(result);
    }


}
