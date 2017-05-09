package main.java.ua.training.model.entity.coffee;

/**
 * Created by allugard on 09.05.17.
 */
public enum KindOfCoffee {
    ARABICA(100), ROBUSTA(150);

    private double pricePerKG;

    KindOfCoffee(double price) {
        this.pricePerKG = price;
    }

    public double getPrice() {
        return pricePerKG;
    }
}
