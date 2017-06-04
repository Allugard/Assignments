package ua.training.vanloading.model.util.select.by.parameters;

import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.model.entity.packaging.Packaging;
import ua.training.vanloading.model.util.select.by.parameters.filter.Filter;
import ua.training.vanloading.model.util.select.by.parameters.filter.HumidityFilter;
import ua.training.vanloading.model.util.select.by.parameters.filter.ScentFilter;

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
