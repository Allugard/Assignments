package main.java.ua.training.project.view;

import main.java.ua.training.project.model.entity.coffee.Coffee;
import main.java.ua.training.project.model.entity.packaging.Packaging;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static main.java.ua.training.project.view.Values.*;

/**
 * Created by allugard on 10.05.17.
 */
public class View {

    private static final String MESSAGES_BUNDLE_NAME = "main/resources/messages";
    private static final String MENU ="menu" ;
    private static final String WRONG_INPUT = "wrong.input";
    private static final String SELECT_MENU_ITEM = "select.menu.item";
    private static final String INPUT_CAPACITY_OF_VAN = "input.capacity.of.van";
    private static final String LOAD_MESSAGE = "load";
    private static final String INPUT_MONEY = "input.money";
    private static final String EMPTY_VAN = "empty.van";
    private static final String LOADED_VAN = "loaded.van";
    private static final String INPUT_REAL_VALUE_IN_DIAPASON = "input.real.value.in.diapason";
    private static final String FIRST_INPUT_SCENT= "first.input.scent";
    private static final String SECOND_INPUT_SCENT= "second.input.scent";
    private static final String ANYTHING_SUITABLE = "anything.suitable";
    private static final String CHOOSE_PARAMETERS = "choose.parameters";
    private final static String GREETINGS = "greetings";
    private static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en",""));

    private boolean en = true;

    private void printMessage(String message){
        System.out.println(message);
    }

    private String concat(String ... messages){
        StringBuilder str = new StringBuilder();
        for (String string: messages) {
            str.append(string);
        }
        return str.toString();
    }

    public void changeLanguage() {
        Locale locale;
        if (en){
            locale = new Locale("ua");
            en = false;
        }else {
            locale = new Locale("en");
            en = true;
        }
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, locale);
    }



    public void printMenu() {
        printMessage(concat(bundle.getString(MENU)));
    }

    public void pringGreetings() {
        printMessage(bundle.getString(GREETINGS));
    }

    public void printWrongInputMessages() {
        printMessage(bundle.getString(WRONG_INPUT));
    }

    public void printSelectMenuItem() {
        printMessage(bundle.getString(SELECT_MENU_ITEM));
    }


    public void printInputCapacity() {
        printMessage(bundle.getString(INPUT_CAPACITY_OF_VAN));
    }

    public void printLoadMessage() {
        printMessage(bundle.getString(LOAD_MESSAGE));
    }

    public void printInputMoney() {
        printMessage(bundle.getString(INPUT_MONEY));
    }

    public void printVanContent(List<Packaging> packagings) {
        if (packagings.isEmpty()){
            printMessage(bundle.getString(EMPTY_VAN));
            return;
        }
        printContent(packagings);
    }

    public void printVanLoaded() {
        printMessage(bundle.getString(LOADED_VAN));
    }

    public void printInputHumidityInDiapason(double v, double v1) {
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getString(INPUT_REAL_VALUE_IN_DIAPASON))
                .append(LEFT_BRACKETS)
                .append(v)
                .append(DASH)
                .append(v1)
                .append(RIGHTS_BRACKETS)
                .append(DOT);
        printMessage(sb.toString());
    }

    public void printFirstInputScent() {
        printMessage(bundle.getString(FIRST_INPUT_SCENT));
    }

    public void printSecondInputScent(Double last) {
        printMessage(bundle.getString(SECOND_INPUT_SCENT));
        printMessage(concat(bundle.getString(SECOND_INPUT_SCENT), SPACE, Double.toString(last)));
    }

    public void printSelectedProducts(List<Packaging> packagings) {
        if (packagings.isEmpty()){
            printMessage(bundle.getString(ANYTHING_SUITABLE));
            return;
        }
        if (packagings == null){
            printMessage(bundle.getString(CHOOSE_PARAMETERS));
            return;
        }
        printContent(packagings);
    }

    private void printContent(List<Packaging> packagings) {
        StringBuilder sb = new StringBuilder();
        for (Packaging packaging :
                packagings) {
            sb.append(packaging.getPackagingType())
                    .append(SPACE).append(packaging.getPackagingSize())
                    .append(SPACE).append(packaging.getPrice())
                    .append(SPACE).append(packaging.getVolume())
                    .append(SPACE).append(((Coffee) packaging.getProduct()).getKindOfCoffee())
                    .append(SPACE).append(((Coffee) packaging.getProduct()).getState()).append(NEW_ROW);
        }
        printMessage(sb.toString());
    }
}
