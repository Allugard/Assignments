package main.java.ua.training.view;

import static main.java.ua.training.util.GlovalValues.*;
import static main.java.ua.training.view.ViewMessages.*;

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
            str.append(messages);
        }
        return str.toString();
    }

    public void printInputFirstNameMessages(){
        printMessage(concat(ENTER + SPACE +FIRST_NAME + DOT));
    }
    public void printInputLastNameMessages(){
        printMessage(concat(ENTER + SPACE + LAST_NAME + DOT));
    }
    public void printInputEmailMessages(){
        printMessage(concat(ENTER + SPACE + EMAIL + DOT));
    }
    public void printInputPhoneMessages(){
        printMessage(concat(ENTER + SPACE + PHONE + DOT));
    }

    public void printInputCityMessages(){
        printMessage(concat(ENTER + SPACE + CITY + DOT));
    }

    public void printInputStreetMessages(){
        printMessage(concat(ENTER + SPACE + STREET + DOT));
    }

    public void printInputAppartmentNumberMessages(){
        printMessage(concat(ENTER + SPACE + APPARTMENT_NUMBER + DOT));
    }

    public void printInputHouseNumberMessages(){
        printMessage(concat(ENTER + SPACE + HOUSE_NUMBER + DOT));
    }

    public void printWrongInputMessages(){
        printMessage(concat(ENTER + SPACE + WRONG_INPUT + DOT));
    }

    public void printResultMessages(){
        printMessage(concat(RESULT + NEW_ROW));
    }


}
