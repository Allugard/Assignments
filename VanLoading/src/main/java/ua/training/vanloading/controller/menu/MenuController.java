package ua.training.vanloading.controller.menu;

import ua.training.vanloading.controller.menu.action.*;
import ua.training.vanloading.model.CoffeeVan;
import ua.training.vanloading.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 10.05.17.
 */
public class MenuController extends ActionWithInputData {

    private  CoffeeVan model;

    public MenuController(CoffeeVan model, View view, Scanner sc) {
        super(view, sc);
        this.model = model;
    }

    private Action changeAction() {
        view.printMenu();
        String input = inputData(Values.REG_EX_CODE);
        switch (input){
            case Values.EXIT_CODE:
                return new Exit();
            case Values.LOAD_VAN:
                return new LoadVan(model, view, sc);
            case Values.SELECT_PRODUCT:
                return new SelectProductInDiapason(model, view, sc);
            case Values.CHANGE_LANGUAGE:
                return new ChangeLanguage(view);
            case Values.PRINT_VAN:
                view.printVanContent(model.getPackagings());
                break;
            default:
                view.printSelectMenuItem();
        }
        return changeAction();
    }

    private void execute(Action action) {
        action.execute();
    }

    @Override
    public void execute() {
        view.pringGreetings();
        while (true) {
            execute(changeAction());
        }
    }
}
