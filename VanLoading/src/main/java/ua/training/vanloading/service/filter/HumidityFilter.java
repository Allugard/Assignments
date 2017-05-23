package ua.training.vanloading.service.filter;

import ua.training.vanloading.model.entity.coffee.Coffee;
import ua.training.vanloading.model.entity.packaging.Packaging;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Verner on 10.05.2017.
 */
public class HumidityFilter extends Filter {
    
    public HumidityFilter(double leftLimit, double rightLimit) {
        super(leftLimit, rightLimit);
    }

    @Override
    protected void execute(List<Packaging> packagings) {
        Iterator <Packaging> iterator = packagings.iterator();
        while (iterator.hasNext()){
            Packaging buf = iterator.next();
            if(((Coffee) buf.getProduct()).getKindOfCoffee().getHumidity()<leftLimit ||
                    ((Coffee) buf.getProduct()).getKindOfCoffee().getHumidity()>rightLimit){
                iterator.remove();
            }
        }
    }
}
