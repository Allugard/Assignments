package main.java.ua.training.controller.menu;

import main.java.ua.training.controller.menu.action.ActionUser;
import main.java.ua.training.controller.menu.action.Exit;
import main.java.ua.training.controller.menu.action.LoadVan;
import main.java.ua.training.model.CoffeeVan;
import main.java.ua.training.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public class MenuController extends PrintedMenuItem {

    private  CoffeeVan model;

    public MenuController(CoffeeVan model, View view, Scanner sc) {
        super(view, sc);
        this.model = model;
    }

    public void process() {
        view.pringGreetings();
        while (true) {
            execute(changeAction());
        }
    }

    private ActionUser changeAction() {
        view.printMenu();
        String input = inputData(Values.REG_EX_CODE);
        switch (input){
            case Values.EXIT_CODE:
                return new Exit();
            case Values.LOAD_VAN:
                return new LoadVan(model, view, sc);
            case Values.PRINT_VAN:
                view.printVanContent(model.getPackagings());
                break;
            default:
                view.printSelectMenuItem();
        }
        return changeAction();
    }

    private void execute(ActionUser action) {
        action.execute();
    }

}
