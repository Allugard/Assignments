package main.java.ua.training.view;

import main.java.ua.training.model.entity.coffee.Coffee;
import main.java.ua.training.model.entity.packaging.Packaging;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

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
    private static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    private final static String GREETINGS = "greetings";

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
        if (bundle.getLocale().equals(Locale.ENGLISH)){
            locale = new Locale("ua");
        }else {
            locale = new Locale("en");
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
            printMessage(EMPTY_VAN);
        }
        StringBuilder sb = new StringBuilder();
        for (Packaging packaging :
                packagings) {
            sb.append(packaging.getPackagingType())
                    .append(" ").append(packaging.getPackagingSize())
                    .append(" ").append(packaging.getPrice())
                    .append(" ").append(packaging.getVolume())
                    .append(" ").append(((Coffee) packaging.getProduct()).getKindOfCoffee())
                    .append(" ").append(((Coffee) packaging.getProduct()).getState()).append("\n");
        }
        printMessage(sb.toString());
    }

    public void printVanLoaded() {
        printMessage(LOADED_VAN);
    }
}
