package main.java.ua.training.controller.menu.action;

import main.java.ua.training.controller.menu.PrintedMenuItem;
import main.java.ua.training.controller.menu.Values;
import main.java.ua.training.model.CoffeeVan;
import main.java.ua.training.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public class LoadVan extends PrintedMenuItem implements ActionUser {

    private CoffeeVan model;

    public LoadVan(CoffeeVan model, View view, Scanner sc) {
        super(view, sc);
        this.model = model;
    }

    @Override
    public void execute() {
        view.printInputCapacity();
        model.setCapacity(Integer.parseInt(inputData(Values.REG_EX_CAPACITY)));
        load();
    }

    private void load() {

    }
}
