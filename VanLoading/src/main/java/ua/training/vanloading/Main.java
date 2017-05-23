package ua.training.vanloading;

import ua.training.vanloading.controller.Controller;
import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.view.View;

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
