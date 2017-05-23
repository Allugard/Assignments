package ua.training.customarraylist;

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
    @Test(expected = UnsupportedOperationException.class)
    public void testSet() throws Exception {
        List<Object> objects = new CustomArrayList<>();
        objects.add(new Object());
        objects.add(new Object());

        objects.set(1, new Object());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveByIndex() throws Exception {
        List<Object> objects = new CustomArrayList<>();
        objects.add(new Object());

        objects.remove(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveByObject() throws Exception {
        List<Object> objects = new CustomArrayList<>();
        Object object = new Object();
        objects.add(object);

        objects.remove(object);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll() throws Exception {
        List<Object> objects = new CustomArrayList<>();
        objects.add(new Object());
        objects.add(new Object());

        List <Object> objectList = new  CustomArrayList();

        objects.removeAll(objectList);
    }

}