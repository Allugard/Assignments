package main.java.ua.training.controller.menu;

import main.java.ua.training.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public abstract class PrintedMenuItem {
    protected View view;
    protected Scanner sc;

    public PrintedMenuItem(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    protected String inputData(String regex) {
        String res = "";
        while(!(sc.hasNextLine() && checkInputString(res=sc.nextLine(), regex))){
            view.printWrongInputMessages();
        }
        return res;
    }

    public boolean checkInputString(String str, String regex){
        return str.matches(regex);
    }

}
