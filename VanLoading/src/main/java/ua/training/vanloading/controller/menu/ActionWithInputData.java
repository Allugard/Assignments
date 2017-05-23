package ua.training.vanloading.controller.menu;

import ua.training.vanloading.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public abstract class ActionWithInputData implements Action {
    protected View view;
    protected Scanner sc;

    public ActionWithInputData(View view, Scanner sc) {
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
