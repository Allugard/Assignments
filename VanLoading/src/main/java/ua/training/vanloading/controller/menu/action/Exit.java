package ua.training.vanloading.controller.menu.action;

import ua.training.vanloading.controller.menu.Action;

/**
 * Created by allugard on 10.05.17.
 */
public class Exit implements Action {
    @Override
    public void execute() {
        System.exit(0);
    }
}
