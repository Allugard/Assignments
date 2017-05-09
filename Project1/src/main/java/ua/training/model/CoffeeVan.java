package main.java.ua.training.model;

import main.java.ua.training.model.entity.packaging.Packaging;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by allugard on 09.05.17.
 */
public class CoffeeVan {
    private double capacity;
    private double currentVolume;
    private List <Packaging> packagings;

    public CoffeeVan(double capacity) {
        this.capacity = capacity;
        packagings = new ArrayList<>();
    }
}
