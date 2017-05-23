package ua.training.customarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by allugard on 23.05.17.
 */
public class CustomArrayList<E>  {

    private final List<E> arrayList = new ArrayList<E>();

    public boolean add(E object){
        return arrayList.add(object);
    }

    public void add(int index, E object){
        arrayList.add(index, object);
    }

    public boolean contains(E object){
        return arrayList.contains(object);
    }

    public E get(int index){
        return arrayList.get(index);
    }
}
