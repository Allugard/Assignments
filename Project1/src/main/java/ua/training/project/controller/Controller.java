package main.java.ua.training.project.controller;

import main.java.ua.training.project.controller.menu.MenuController;
import main.java.ua.training.project.model.CoffeeVan;
import main.java.ua.training.project.view.View;

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
