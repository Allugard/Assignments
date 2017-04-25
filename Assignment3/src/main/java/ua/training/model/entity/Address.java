package main.java.ua.training.model.entity;

import main.java.ua.training.util.GlovalValues;

/**
 * Created by allugard on 25.04.17.
 */
public class Address {

    private String town;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public Address(String town, String street, String houseNumber, String apartmentNumber) {
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(town).append(GlovalValues.COMMA).append(GlovalValues.SPACE)
                .append(street).append(GlovalValues.COMMA).append(GlovalValues.SPACE)
                .append(houseNumber).append(GlovalValues.COMMA).append(GlovalValues.SPACE)
                .append(apartmentNumber).append(GlovalValues.COMMA).append(GlovalValues.SPACE)
                .append(GlovalValues.SEMICOLON);
        return sb.toString();
    }
}
