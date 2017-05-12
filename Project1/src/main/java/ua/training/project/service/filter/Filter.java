package main.java.ua.training.project.service.filter;

import main.java.ua.training.project.model.entity.packaging.Packaging;

import java.util.List;
import java.util.Objects;

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
