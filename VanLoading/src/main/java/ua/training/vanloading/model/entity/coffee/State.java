package ua.training.vanloading.model.entity.coffee;

/**
 * Created by allugard on 09.05.17.
 */
public enum State {
    GRANULAR(0.95), INSTANT(0.9), GROUND(1.);

    private State(double a){
        modifierForPrice = a;
    }

    private double modifierForPrice;

    public double getModifierForPrice() {
        return modifierForPrice;
    }
}
