package main.java.ua.training.project.model.entity.coffee;

/**
 * Created by allugard on 09.05.17.
 */
public enum KindOfCoffee {
    ARABICA(100, 0.9, 20), ROBUSTA(150,0.6, 15);

    private double pricePerKG;
    private double humidity;
    private double scent;

    KindOfCoffee(double pricePerKG, double humidity, double scent) {
        this.pricePerKG = pricePerKG;
        this.humidity = humidity;
        this.scent = scent;
    }

    public double getPrice() {
        return pricePerKG;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getScent() {
        return scent;
    }
}
