package main.java.ua.training.project.controller.menu.action;

import main.java.ua.training.project.controller.menu.Values;
import main.java.ua.training.project.model.CoffeeVan;
import main.java.ua.training.project.service.SelectorCoffeeByParameters;
import main.java.ua.training.project.view.View;

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
