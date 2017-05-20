package main.java.ua.training.project;

import main.java.ua.training.project.controller.Controller;
import main.java.ua.training.project.model.CoffeeVan;
import main.java.ua.training.project.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by allugard on 09.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new CoffeeVan());
        controller.processUser();
    }
}
