package ua.training.model.entity;

import static ua.training.util.GlovalValues.*;

/**
 * Created by allugard on 25.04.17.
 */
public class Note {

    private FullName fullName;
    private String login;
    private String email;
    private String phone;
    private Address address;

    private Note(FullName fullName, String login, String email, String phone, Address address) {
        this.login = login;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public static Note build(String firstName, String lastName, String login, String email, String phone,
                             String town, String street, String houseNumber, String apartmentNumber){
        return new Note(new FullName(firstName, lastName), login, email, phone,
                new Address(town, street, houseNumber, apartmentNumber));
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Full name - ").append(fullName).append(SEMICOLON).append(NEW_ROW).
                append("Login - ").append(login).append(SEMICOLON).append(NEW_ROW).
                append("Email - ").append(email).append(SEMICOLON).append(NEW_ROW).
                append("Phone - ").append(phone).append(SEMICOLON).append(NEW_ROW).
                append("Address:").append(address).append(DOT);
        return sb.toString();
    }
}
