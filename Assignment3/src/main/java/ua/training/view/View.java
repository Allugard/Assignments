package ua.training.view;

import static ua.training.util.GlovalValues.*;
import static ua.training.view.ViewMessages.*;

/**
 * Created by allugard on 16.04.17.
 */
public class View {


    public void printMessage(String message){
        System.out.println(message);
    }

    public String concat(String ... messages){
        StringBuilder str = new StringBuilder();
        for (String string: messages) {
            str.append(string);
        }
        return str.toString();
    }

    public void printInputFirstNameMessages(){
        printMessage(concat(ENTER, SPACE, FIRST_NAME, COLON));
    }
    public void printInputLastNameMessages(){
        printMessage(concat(ENTER, SPACE, LAST_NAME, COLON));
    }
    public void printInputEmailMessages(){
        printMessage(concat(ENTER, SPACE, EMAIL, COLON));
    }
    public void printInputPhoneMessages(){
        printMessage(concat(ENTER, SPACE, PHONE, COLON));
    }

    public void printInputCityMessages(){
        printMessage(concat(ENTER, SPACE, CITY, COLON));
    }

    public void printInputStreetMessages(){
        printMessage(concat(ENTER, SPACE, STREET, COLON));
    }

    public void printInputAppartmentNumberMessages(){
        printMessage(concat(ENTER, SPACE, APPARTMENT_NUMBER, COLON));
    }

    public void printInputHouseNumberMessages(){
        printMessage(concat(ENTER, SPACE, HOUSE_NUMBER, COLON));
    }

    public void printWrongInputMessages(){
        printMessage(concat(ENTER, SPACE, WRONG_INPUT, DOT));
    }

    public void printResultMessages(){
        printMessage(concat(RESULT, COLON));
    }


}
