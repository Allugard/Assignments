package ua.training.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allugard on 17.04.17.
 */
public class ModelTest {
    @Test
    public void testRandFromZeroToOneHundred() {
        Model model = Model.WithRange(0, 100);
        for (int i = 0; i <10000; i++) {
            int actual = model.rand();
            if (actual<0 || actual > 100){
                fail();
            }
        }
    }

    @Test (expected = NullPointerException.class)
    public void testRandWithEmptyLimits(){
        Model model = new Model();
        model.rand();
    }

    @Test ()
    public void testIsInRangeWithValueInRange(){
        Model model = Model.WithRange(0, 100);
        boolean actual = model.isInRange(5);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test ()
    public void testIsInRangeWithValueOutOfRange(){
        Model model = Model.WithRange(0, 100);
        boolean actual = model.isInRange(101);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void testIsInRangeWithEmptyLimits(){
        Model model = new Model();
        model.isInRange(((int) (Math.random()*100)));
    }

    @Test (expected = NullPointerException.class)
    public void testCheckValueWithEmptyLimits(){
        Model model = new Model();
        model.checkValue((((int) (Math.random()*100))));
    }

    @Test (expected = NullPointerException.class)
    public void testCheckValueWithEmptyTargetValue(){
        Model model = Model.WithRange(0,100);
        model.checkValue((((int) (Math.random()*100))));
    }

    @Test ()
    public void testCheckValueWithRightValue(){
        Model model = Model.WithRange(0,100);
        int rand = model.rand();
        model.setTargetValue(rand);
        boolean expected = true;
        boolean actual = model.checkValue(rand);
        assertEquals(expected, actual);
    }

    @Test ()
    public void testCheckValueWithWrongValue(){
        Model model = Model.WithRange(0,100);
        int rand = model.rand();
        model.setTargetValue(rand);
        boolean expected = false;
        boolean actual = model.checkValue(rand+1);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddToWayNull(){
        Model model = new Model();
        boolean expected = true;
        boolean actual = model.addToWay(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddToWayNumberFive(){
        Model model = new Model();
        boolean expected = true;
        boolean actual = model.addToWay(5);
        assertEquals(expected, actual);
    }



}