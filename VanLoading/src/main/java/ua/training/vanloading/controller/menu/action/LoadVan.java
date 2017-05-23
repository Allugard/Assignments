package ua.training.vanloading.controller.menu.action;


import ua.training.vanloading.controller.menu.ActionWithInputData;
import ua.training.vanloading.controller.menu.Values;
import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.model.entity.coffee.KindOfCoffee;
import ua.training.vanloading.model.entity.coffee.State;
import ua.training.vanloading.model.entity.packaging.Packaging;
import ua.training.vanloading.model.entity.packaging.PackagingSize;
import ua.training.vanloading.model.entity.packaging.PackagingType;
import ua.training.vanloading.service.PackagingCoffeeBuilder;
import ua.training.vanloading.view.View;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public class LoadVan extends ActionWithInputData {

    private CoffeeVan model;

    public LoadVan(CoffeeVan model, View view, Scanner sc) {
        super(view, sc);
        this.model = model;
    }

    @Override
    public void execute() {
        if (model.isEmpty()) {
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
