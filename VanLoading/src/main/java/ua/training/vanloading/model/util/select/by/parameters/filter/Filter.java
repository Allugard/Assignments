package ua.training.vanloading.model.util.select.by.parameters.filter;

import ua.training.vanloading.model.entity.packaging.Packaging;

import java.util.List;

/**
 * Created by allugard on 10.05.17.
 */
public abstract class Filter {

    protected Filter next;
    protected double leftLimit;
    protected double rightLimit;

    public Filter(double leftLimit, double rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public void filter(List<Packaging> packagings){
        execute(packagings);
        if (next != null){
            next.filter(packagings);
        }
    }

    protected abstract void execute(List<Packaging> packagings);

    public Filter getNext() {
        return next;
    }

    public void setNext(Filter next) {
        this.next = next;
    }
}
