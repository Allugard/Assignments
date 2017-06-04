package ua.training.vanloading.controller.menu;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by allugard on 12.05.17.
 */
public class RegExTest {

    @Test
    public void capacityTestWithOneHundred(){
        boolean expected = true;
        boolean actual = new String ("100").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void capacityTestWithReal(){
        boolean expected = false;
        boolean actual = new String ("9.5").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void capacityTestWithNegative(){
        boolean expected = false;
        boolean actual = new String ("-100").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void capacityTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void codeTestWithTwo(){
        boolean expected = true;
        boolean actual = new String ("2").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void codeTestWithNegative(){
        boolean expected = false;
        boolean actual = new String ("-2").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void codeTestWithTwenty(){
        boolean expected = false;
        boolean actual = new String ("20").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void codeTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void codeTestWithReal(){
        boolean expected = false;
        boolean actual = new String ("1.5").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void humidityTestWithZeroDotOne(){
        boolean expected = true;
        boolean actual = new String ("0.1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void humidityTestWithMinusOne(){
        boolean expected = true;
        boolean actual = new String ("-1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void humidityTestWithOneDotOne(){
        boolean expected = false;
        boolean actual = new String ("1.1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void humidityTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scentTestWithZeroDotOne(){
        boolean expected = true;
        boolean actual = new String ("0.1").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scentTestWithInteger(){
        boolean expected = true;
        boolean actual = new String ("5").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scentTestWithMinusOne(){
        boolean expected = true;
        boolean actual = new String ("-1").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scentTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }
}