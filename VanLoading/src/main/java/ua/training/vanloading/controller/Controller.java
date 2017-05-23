package ua.training.vanloading.controller;

import ua.training.vanloading.controller.menu.MenuController;
import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public class Controller {
    View view;
    CoffeeVan model;

    public Controller(View view, CoffeeVan model) {
        this.view = view;
        this.model = model;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        new MenuController(model, view, sc).execute();
    }
}
