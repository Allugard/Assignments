package test.java.ua.training.project.controller.menu;

import main.java.ua.training.project.controller.menu.Values;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allugard on 12.05.17.
 */
public class RegExTest {

    @Test
    public void CapacityTestWithOneHundred(){
        boolean expected = true;
        boolean actual = new String ("100").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CapacityTestWithReal(){
        boolean expected = false;
        boolean actual = new String ("9.5").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CapacityTestWithNegative(){
        boolean expected = false;
        boolean actual = new String ("-100").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CapacityTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_CAPACITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CodeTestWithTwo(){
        boolean expected = true;
        boolean actual = new String ("2").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CodeTestWithNegative(){
        boolean expected = false;
        boolean actual = new String ("-2").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CodeTestWithTwenty(){
        boolean expected = false;
        boolean actual = new String ("20").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CodeTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CodeTestWithReal(){
        boolean expected = false;
        boolean actual = new String ("1.5").matches(Values.REG_EX_CODE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumidityTestWithZeroDotOne(){
        boolean expected = true;
        boolean actual = new String ("0.1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumidityTestWithMinusOne(){
        boolean expected = true;
        boolean actual = new String ("-1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumidityTestWithOneDotOne(){
        boolean expected = false;
        boolean actual = new String ("1.1").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HumidityTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ScentTestWithZeroDotOne(){
        boolean expected = true;
        boolean actual = new String ("0.1").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ScentTestWithInteger(){
        boolean expected = true;
        boolean actual = new String ("5").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ScentTestWithMinusOne(){
        boolean expected = true;
        boolean actual = new String ("-1").matches(Values.REG_EX_SCENT);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ScentTestNotWithNumber(){
        boolean expected = false;
        boolean actual = new String ("abc").matches(Values.REG_EX_HUMIDITY);
        Assert.assertEquals(expected, actual);
    }
}