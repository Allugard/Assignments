package main.java.ua.training.controller.util;

import main.java.ua.training.model.entity.Note;
import main.java.ua.training.view.View;

import java.util.Scanner;

import static main.java.ua.training.controller.util.RegularExpression.*;

/**
 * Created by allugard on 25.04.17.
 */
public class InputNoteController {

    private Scanner sc;
    private View view;

    private String firstName;
    private String lastName;

    private String email;
    private String phone;

    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;


    public InputNoteController(Scanner scanner, View view) {
        this.sc = scanner;
        this.view = view;
    }

    public Note buildNote() {
        view.printInputFirstNameMessages();
        firstName = inputData(FIRST_NAME_REG_EX);

        view.printInputLastNameMessages();
        lastName = inputData(SECOND_NAME__REG_EX);

        view.printInputEmailMessages();
        email = inputData(EMAIL_REG_EX);

        view.printInputPhoneMessages();
        phone = inputData(MOBILE_PHONE_REG_EX);

        view.printInputCityMessages();
        city = inputData(CITY_REG_EX);

        view.printInputStreetMessages();
        street = inputData(STREET_REG_EX);

        view.printInputHouseNumberMessages();
        houseNumber = inputData(NUMBER_HOME_REG_EX);

        view.printInputAppartmentNumberMessages();
        apartmentNumber = inputData(APPARTMENT_NUMBER_REG_EX);

        return Note.Build(firstName, lastName, email, phone, city, street, houseNumber, apartmentNumber);
    }

    private String inputData(String regex) {
        String res = "";
        while(!(sc.hasNext() && (res = sc.next()).matches(regex))){
            view.printWrongInputMessages();
        }
        return res;

    }


}
