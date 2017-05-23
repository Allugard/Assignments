package ua.training.vanloading.controller.menu.action;

import ua.training.vanloading.controller.menu.Action;
import ua.training.vanloading.view.View;

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
