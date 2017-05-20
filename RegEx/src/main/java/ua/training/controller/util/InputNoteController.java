package ua.training.controller.util;

import ua.training.model.entity.Note;
import ua.training.view.View;

import java.util.Scanner;

import static ua.training.controller.util.RegularExpression.*;

/**
 * Created by allugard on 25.04.17.
 */
public class InputNoteController {

    private Scanner sc;
    private View view;

    private String firstName;
    private String lastName;

    private String login;

    private String email;
    private String phone;

    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    private Note note;


    public InputNoteController(Scanner scanner, View view) {
        this.sc = scanner;
        this.view = view;
    }

    public Note buildNote() {
        if (note == null) {

            view.printInputFirstNameMessages();
            firstName = inputData(FIRST_NAME_REG_EX);

            view.printInputLastNameMessages();
            lastName = inputData(SECOND_NAME_REG_EX);

            view.printInputLoginMessages();
            login = inputData(LOGIN_REG_EX);

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

            note = Note.Build(firstName, lastName, login, email, phone, city, street, houseNumber, apartmentNumber);
        }

        return note;
    }

    private String inputData(String regex) {
        String res = "";
        while(!(sc.hasNextLine() && checkInputString(res=sc.nextLine(), regex))){
            view.printWrongInputMessages();
        }
        return res;
    }

    public boolean checkInputString(String str, String regex){
        return str.matches(regex);
    }


    public void inputNewLogin() {
        view.printWrongLoginMessages();
        view.printInputLoginMessages();
        login = inputData(LOGIN_REG_EX);
        note.setLogin(login);
    }
}
