package test;

import classes.Game;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameTest {

    Game game;

    @BeforeMethod
    public void setUp() {
        game = new Game();
    }


    @Test
    public void playFizzBuzzWhenArgumentIsThreeTest() {
        String result= game.playFizzBuzz(3);

        Assert.assertEquals(result,"Fizz");
    }

    @Test
    public void playFizzBuzzWhenArgumentIsFiveTest() {
        String result= game.playFizzBuzz(5);

        Assert.assertEquals(result,"Buzz");
    }

    @Test
    public void playFizzBuzzWhenArgumentIsFifteenTest() {
        String result= game.playFizzBuzz(15);

        Assert.assertEquals(result,"FizzBuzz");
    }

    @Test
    public void playFizzBuzzWhenArgumentIsNothingMentionedBeforeTest() {
        String result= game.playFizzBuzz(7);

        Assert.assertEquals(result,"7");
    }
}
