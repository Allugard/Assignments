package ua.training.controller.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.training.controller.util.RegularExpression.*;

/**
 * Created by allugard on 25.04.17.
 */
public class RegularExpressionTest {

    @Test
    public void firstNameTestWithRightValue(){
        String name = "Sergei";
        boolean expected = true;
        boolean actual = name.matches(FIRST_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameTestWithSmallFirstLetter(){
        String name = "sergei";
        boolean expected = false;
        boolean actual = name.matches(FIRST_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameTestWithLargeLetterInMiddle(){
        String name = "SeRgei";
        boolean expected = false;
        boolean actual = name.matches(FIRST_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithRightValue(){
        String name = "Vasilenko";
        boolean expected = true;
        boolean actual = name.matches(SECOND_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithSmallFirstLetter(){
        String name = "vasilenko";
        boolean expected = false;
        boolean actual = name.matches(SECOND_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithLargeLetterInMiddle(){
        String name = "VasilEnko";
        boolean expected = false;
        boolean actual = name.matches(SECOND_NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithRightValue(){
        String city = "Kiyv";
        boolean expected = true;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithSmallFirstLetter(){
        String city = "kiyv";
        boolean expected = false;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithLargeLetterInMiddle(){
        String city = "KiYv";
        boolean expected = false;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithRightValue(){
        String street = "Remennogo";
        boolean expected = true;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithSmallFirstLetter(){
        String street = "remennogo";
        boolean expected = false;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithLargeLetterInMiddle(){
        String street = "ReMmMennogo";
        boolean expected = false;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestRightValue(){
        String email = "cen@gmail.com";
        boolean expected = true;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutPrefix(){
        String email = "@gmail.com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutDot(){
        String email = "ce@com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutSuffixAfterDot(){
        String email = "ce@com.";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void appartmentNumberTestRightValue(){
        String num = "5";
        boolean expected = true;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void appartmentNumberTestWithNegativeNumber(){
        String num = "-5";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void appartmentNumberTestWithRealNumber(){
        String num = "5.0";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void appartmentNumberTestWithString(){
        String num = "Some sentence";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestRightValue(){
        String num = "5";
        boolean expected = true;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithNegativeNumber(){
        String num = "-5";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithRealNumber(){
        String num = "5.0";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithString(){
        String num = "Some sentence";
        boolean expected = false;
        boolean actual = num.matches(APPARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void phoneTestRightValue(){
        String phone = "0505318287";
        boolean expected = true;
        boolean actual = phone.matches(MOBILE_PHONE_REG_EX);
        assertEquals(expected, actual);
    }
}