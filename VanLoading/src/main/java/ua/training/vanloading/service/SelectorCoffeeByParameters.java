package main.java.ua.training.project.service;

import main.java.ua.training.project.model.CoffeeVan;
import main.java.ua.training.project.model.entity.packaging.Packaging;
import main.java.ua.training.project.service.filter.Filter;
import main.java.ua.training.project.service.filter.HumidityFilter;
import main.java.ua.training.project.service.filter.ScentFilter;

import java.util.*;

/**
 * Created by allugard on 11.05.17.
 */
public class SelectorCoffeeByParameters {

    private CoffeeVan model;

    public SelectorCoffeeByParameters(CoffeeVan model) {
        this.model = model;
    }

    public List selectProductsWithParameters(Deque<Double> doubles) {
        List <Packaging> packagings = new ArrayList<>(model.getPackagings());
        Filter filter = null;
        Iterator <Double> iterator = doubles.iterator();
        double first = iterator.next();
        if( first != -1.){
            filter = new HumidityFilter(first, iterator.next());
        }

        first = iterator.next();
        if( first != -1.){
            if (Objects.isNull(filter)){
                filter = new ScentFilter(first, iterator.next());
            }else {
                filter.setNext(new ScentFilter(first, iterator.next()));
            }
        }

        if (Objects.isNull(filter)){
            return null;
        }

        filter.filter(packagings);
        return packagings;
    }
}
