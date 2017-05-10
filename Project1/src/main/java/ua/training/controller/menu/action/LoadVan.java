package main.java.ua.training.controller.menu.action;

import main.java.ua.training.controller.menu.PrintedMenuItem;
import main.java.ua.training.controller.menu.Values;
import main.java.ua.training.controller.util.PackagingCoffeeBuilder;
import main.java.ua.training.model.CoffeeVan;
import main.java.ua.training.model.entity.Product;
import main.java.ua.training.model.entity.coffee.KindOfCoffee;
import main.java.ua.training.model.entity.coffee.State;
import main.java.ua.training.model.entity.packaging.Packaging;
import main.java.ua.training.model.entity.packaging.PackagingSize;
import main.java.ua.training.model.entity.packaging.PackagingType;
import main.java.ua.training.view.View;

import java.util.Random;
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
        if (!model.isEmpty()) {
            view.printInputCapacity();
            model.setCapacity(Integer.parseInt(inputData(Values.REG_EX_CAPACITY)));
            view.printInputMoney();
            model.setMaxMoney(Integer.parseInt(inputData(Values.REG_EX_CAPACITY)));
            load();
            model.sort();
            view.printLoadMessage();
        }else {
            view.printVanLoaded();
        }
    }

    private void load() {
        PackagingCoffeeBuilder packagingCoffeeBuilder = new PackagingCoffeeBuilder();
        Random r = new Random();
        boolean load = true;
        while (load){
            packagingCoffeeBuilder.buildKindOfCoffee(KindOfCoffee.values()[r.nextInt(KindOfCoffee.values().length)]);
            packagingCoffeeBuilder.buildPackagingSize(PackagingSize.values()[r.nextInt(PackagingSize.values().length)]);
            packagingCoffeeBuilder.buildPackagingType(PackagingType.values()[r.nextInt(PackagingType.values().length)]);
            packagingCoffeeBuilder.buildState(State.values()[r.nextInt(State.values().length)]);
            Packaging product = packagingCoffeeBuilder.build();
            if(product.getPrice() >  model.getRemainingMoney() || product.getVolume() > model.getCapacity() - model.getCurrentVolume()) {
                load = false;
            }else {
                model.add(product);
                model.addCurrentVolume(product.getVolume());
                model.divRemainingMoney(product.getPrice());
            }
        }
    }



}
