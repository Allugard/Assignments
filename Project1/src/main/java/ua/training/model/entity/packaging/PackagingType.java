package main.java.ua.training.model.entity.packaging;

/**
 * Created by allugard on 09.05.17.
 */
public enum PackagingType {
    PACK(5.,10), CANISTER(6., 20);

    private double volume;
    private double pricePerUnit;

    PackagingType(double volume, double price) {
        this.volume = volume;
        this.pricePerUnit = price;
    }

    public double getVolume() {
        return volume;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
