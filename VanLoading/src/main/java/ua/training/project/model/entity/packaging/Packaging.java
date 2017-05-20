package main.java.ua.training.project.model.entity.packaging;

import main.java.ua.training.project.model.entity.Product;

/**
 * Created by allugard on 09.05.17.
 */
public class Packaging implements Product {

    private Product product;
    private PackagingType packagingType;
    private PackagingSize packagingSize;

    public Packaging(Product product, PackagingType packagingType, PackagingSize packagingSize) {
        this.product = product;
        this.packagingType = packagingType;
        this.packagingSize = packagingSize;
    }

    @Override
    public double getPrice() {
        return packagingSize.getModifierForCoffee()*product.getPrice() + packagingSize.getModifierForPackagingType()*packagingType.getPricePerUnit();
    }

    public double getVolume(){
        return packagingSize.getModifierForPackagingType()*packagingType.getVolume();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public PackagingSize getPackagingSize() {
        return packagingSize;
    }

    public void setPackagingSize(PackagingSize packagingSize) {
        this.packagingSize = packagingSize;
    }
}
