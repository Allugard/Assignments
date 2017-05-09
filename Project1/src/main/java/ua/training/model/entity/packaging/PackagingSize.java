package main.java.ua.training.model.entity.packaging;

/**
 * Created by allugard on 09.05.17.
 */
public enum  PackagingSize {
    SMALL(1., 0.06), LARGE(2., 0.25);

    private double modifierForCoffee;
    private double modifierForPackagingType;

    PackagingSize(double modifierForCoffee, double modifierForPackagingType) {
        this.modifierForCoffee = modifierForCoffee;
        this.modifierForPackagingType = modifierForPackagingType;
    }

    public double getModifierForCoffee() {
        return modifierForCoffee;
    }

    public double getModifierForPackagingType() {
        return modifierForPackagingType;
    }
}
