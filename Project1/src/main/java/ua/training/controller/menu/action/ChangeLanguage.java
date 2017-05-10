package main.java.ua.training.controller.menu.action;

import main.java.ua.training.view.View;

/**
 * Created by allugard on 10.05.17.
 */
public class ChangeLanguage implements ActionUser {
    View view;

    public ChangeLanguage(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.changeLanguage();
    }
}
