package main.java.ua.training.controller.menu.action;

/**
 * Created by allugard on 10.05.17.
 */
public class Exit implements ActionUser {
    @Override
    public void execute() {
        System.exit(0);
    }
}
