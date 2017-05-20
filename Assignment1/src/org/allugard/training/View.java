package org.allugard.training;

/**
 * Created by allugard on 11.04.17.
 */
public class View {
    // Text's constants
    public static final String INPUT_MESSAGE= "Enter word ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUTPUT_MESSAGE = "Output message = ";
    public static final String SUCCESSFULLY_MESSAGE ="Successfully ";

    public void printMessage(String message){
        System.out.println(message);
    }


    public void printMessageAndData(String message, String data){
        System.out.println(message+data);
    }
}
