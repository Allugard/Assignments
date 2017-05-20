package main.java.ua.training.project.model.entity.packaging;

/**
 * Created by allugard on 09.05.17.
 */
public enum PackagingType {
    PACK(5,10), CANISTER(6, 20);

    private int volume;
    private double pricePerUnit;

    PackagingType(int volume, double price) {
        this.volume = volume;
        this.pricePerUnit = price;
    }

    public int getVolume() {
        return volume;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
