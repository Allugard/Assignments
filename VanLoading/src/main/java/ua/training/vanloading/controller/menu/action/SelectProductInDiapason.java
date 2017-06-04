package ua.training.vanloading.controller.menu.action;

import ua.training.vanloading.controller.menu.ActionWithInputData;
import ua.training.vanloading.controller.menu.Values;
import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.model.util.select.by.parameters.SelectorCoffeeByParameters;
import ua.training.vanloading.view.View;

import java.util.*;

/**
 * Created by allugard on 10.05.17.
 */
public class SelectProductInDiapason extends ActionWithInputData {

    private SelectorCoffeeByParameters selector;

    public SelectProductInDiapason(CoffeeVan model, View view, Scanner sc) {
        super(view, sc);
        selector = new SelectorCoffeeByParameters(model);
    }

    @Override
    public void execute() {
        Deque<Double> doubles = new LinkedList<>();
        doubles.add(inputValueFromDiapason(Values.ZERO,Values.ONE));
        if (doubles.getLast() != -1.){
            doubles.add(inputValueFromDiapason(doubles.getLast(),Values.ONE));
        }

        view.printFirstInputScent();
        doubles.add(Double.parseDouble(inputData(Values.REG_EX_SCENT)));
        if(doubles.getLast() != -1.){
            doubles.add(inputValueMoreThan(doubles.getLast()));
        }
        view.printSelectedProducts(selector.selectProductsWithParameters(doubles));
    }

    private Double inputValueMoreThan(Double last) {
        boolean end = false;
        double res=0;
        while (!end) {
            view.printSecondInputScent(last);
            res = Double.parseDouble(inputData(Values.REG_EX_SCENT));
            if (res > last){
                end = true;
            }
        }
        return res;
    }

    private Double inputValueFromDiapason(Double first, Double second) {
        boolean end = false;
        double res=0;
        while (!end) {
            view.printInputHumidityInDiapason(first, second);
            res = Double.parseDouble(inputData(Values.REG_EX_HUMIDITY));
            if (res > first || res < second){
                end = true;
            }
        }
        return res;
    }
}
