package ua.training.vanloading.model.util;

import ua.training.vanloading.model.entity.coffee.Coffee;
import ua.training.vanloading.model.entity.coffee.KindOfCoffee;
import ua.training.vanloading.model.entity.coffee.State;
import ua.training.vanloading.model.entity.packaging.Packaging;
import ua.training.vanloading.model.entity.packaging.PackagingSize;
import ua.training.vanloading.model.entity.packaging.PackagingType;

/**
 * Created by allugard on 10.05.17.
 */
public class PackagingCoffeeBuilder {
    private KindOfCoffee kindOfCoffee = KindOfCoffee.ARABICA;
    private State state = State.GRANULAR;
    private PackagingSize packagingSize = PackagingSize.LARGE;
    private PackagingType packagingType = PackagingType.CANISTER;

    public PackagingCoffeeBuilder buildKindOfCoffee(KindOfCoffee kindOfCoffee){
        this.kindOfCoffee = kindOfCoffee;
        return this;
    }

    public PackagingCoffeeBuilder buildState(State state){
        this.state = state;
        return this;
    }

    public PackagingCoffeeBuilder buildPackagingSize(PackagingSize packagingSize){
        this.packagingSize = packagingSize;
        return this;
    }

    public PackagingCoffeeBuilder buildPackagingType(PackagingType packagingType){
        this.packagingType = packagingType;
        return this;
    }

    public Packaging build(){
        return new Packaging(new Coffee(state, kindOfCoffee), packagingType, packagingSize);
    }
}
