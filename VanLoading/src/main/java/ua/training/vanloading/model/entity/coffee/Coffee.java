package main.java.ua.training.project.model.entity.coffee;

import main.java.ua.training.project.model.entity.Product;

/**
 * Created by allugard on 09.05.17.
 */
public class Coffee implements Product {
    private State state;
    private KindOfCoffee kindOfCoffee;

    public Coffee(State state, KindOfCoffee kindOfCoffee) {
        this.state = state;
        this.kindOfCoffee = kindOfCoffee;
    }

    @Override
    public double getPrice() {
        return state.getModifierForPrice()*kindOfCoffee.getPrice();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public KindOfCoffee getKindOfCoffee() {
        return kindOfCoffee;
    }

    public void setKindOfCoffee(KindOfCoffee kindOfCoffee) {
        this.kindOfCoffee = kindOfCoffee;
    }
}
