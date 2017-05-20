package main.java.ua.training.project.controller.menu.action;

import main.java.ua.training.project.view.View;

/**
 * Created by allugard on 10.05.17.
 */
public class ChangeLanguage implements Action {
    private View view;

    public ChangeLanguage(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.changeLanguage();
    }
}
