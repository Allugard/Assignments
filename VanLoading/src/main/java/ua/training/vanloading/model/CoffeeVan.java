package ua.training.vanloading.model;

import ua.training.vanloading.model.entity.packaging.Packaging;

import java.util.*;

/**
 * Created by allugard on 09.05.17.
 */
public class CoffeeVan {
    private double capacity;
    private double currentVolume;
    private double maxMoney;
    private double remainingMoney;
    private List <Packaging> packagings;

    public CoffeeVan() {
        packagings = new ArrayList<>();
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void addCurrentVolume(double currentVolume) {
        this.currentVolume += currentVolume;
    }

    public void setMaxMoney(double maxMoney) {
        this.maxMoney = maxMoney;
        this.remainingMoney = maxMoney;

    }

    public void divRemainingMoney(double remainingMoney) {
        this.remainingMoney -= remainingMoney;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public double getMaxMoney() {
        return maxMoney;
    }

    public double getRemainingMoney() {
        return remainingMoney;
    }

    public void add(Packaging product) {
        packagings.add(product);
    }

    public List<Packaging> getPackagings() {
        return packagings;
    }

    public void sort() {
        Collections.sort(packagings, new SortedByRatioPriceToVolume());
    }

    public boolean isEmpty() {
        return packagings.isEmpty();
    }

    private class SortedByRatioPriceToVolume implements Comparator<Packaging> {

        public int compare(Packaging obj1, Packaging obj2) {

            double ratio1 = obj1.getPrice()/obj1.getVolume();
            double ratio2 = obj2.getPrice()/obj2.getVolume();
            if (ratio1 > ratio2){
                return 1;
            }
            else if (ratio1 < ratio2){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
