package main.java.ua.training.view;

import main.java.ua.training.util.GlovalValues;

import java.util.List;

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
        printMessage(concat(ViewMessages.ENTER + ViewMessages.FIRST_NAME + GlovalValues.DOT));
    }
    public void printInputLastNameMessages(){
        printMessage(concat(ViewMessages.ENTER + ViewMessages.LAST_NAME + GlovalValues.DOT));
    }
    public void printInputEmailMessages(){
        printMessage(concat(ViewMessages.ENTER + ViewMessages.EMAIL + GlovalValues.DOT));
    }
    public void printInputPhomeMessages(){
        printMessage(concat(ViewMessages.ENTER + ViewMessages.PHONE + GlovalValues.DOT));
    }
    public void printWrongInputMessages(){
        printMessage(concat(ViewMessages.ENTER + ViewMessages.WRONG_INPUT + GlovalValues.DOT));
    }


}
