package ua.training.customarraylist;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by allugard on 23.05.17.
 */
public class CustomArrayListTest {

    @Test
    public void testAddWWithObjectArgument(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        boolean actual = objects.add(new Object());
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddWWithIndexAndObjectArgumentsInRange(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        objects.add(0,new Object());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testAddWWithIndexAndObjectArgumentsOutRange(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        objects.add(5,new Object());
    }

    @Test
    public void testContainsElementFromList(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);
        boolean actual = objects.contains(object);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsElemetnOutOfList(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(new Object());
        boolean actual = objects.contains(object);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSame(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);
        Object returned = objects.get(0);
        boolean actual = object.equals(returned);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexOutOfBounds(){
        CustomArrayList<Object>objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(new Object());
        Object returned = objects.get(5);
    }

}