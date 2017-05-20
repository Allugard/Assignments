package org.allugard.training;

import java.util.Scanner;

/**
 * Created by allugard on 11.04.17.
 */
public class Controller {

    // The Constants
    public static final String HELLO_WORD = "Hello";
    public static final String WORLD_WORD = "World!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        //input data
        inputWordFromConsole(HELLO_WORD, sc);
        inputWordFromConsole(WORLD_WORD, sc);

        //output result
        view.printMessageAndData(View.OUTPUT_MESSAGE, model.getMessage());
    }

    //
    private void inputWordFromConsole(String msg, Scanner sc){
        view.printMessage(View.INPUT_MESSAGE);
        while (sc.hasNextLine()){
            String res = sc.nextLine();
            if (res.compareToIgnoreCase(msg)==0){
                model.addMessage(res);
                view.printMessage(View.SUCCESSFULLY_MESSAGE);
                return;
            } else {
                view.printMessage(View.WRONG_INPUT_DATA);
            }
        }
    }



}
