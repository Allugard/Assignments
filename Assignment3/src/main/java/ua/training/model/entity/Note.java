package main.java.ua.training.model.entity;

import main.java.ua.training.util.GlovalValues;

/**
 * Created by allugard on 25.04.17.
 */
public class Note {

    private FullName fullName;
    private String email;
    private String phone;
    private Address address;

    private Note(FullName fullName, String email, String phone, Address address) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public static Note Build(String firstName, String lastName, String email, String phone,
                      String town, String street, String houseNumber, String apartmentNumber){
        return new Note(new FullName(firstName, lastName), email, phone,
                new Address(town, street, houseNumber, apartmentNumber));
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Note{" +
                "fullName=" + fullName +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
