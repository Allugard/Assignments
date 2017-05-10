package main.java.ua.training;

import main.java.ua.training.controller.Controller;
import main.java.ua.training.model.CoffeeVan;
import main.java.ua.training.view.View;

import java.util.Random;

/**
 * Created by allugard on 09.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new CoffeeVan());
        controller.processUser();
    }
}
