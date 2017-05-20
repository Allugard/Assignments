package main.java.ua.training.project.controller.menu.action;

/**
 * Created by allugard on 10.05.17.
 */
public class Exit implements Action {
    @Override
    public void execute() {
        System.exit(0);
    }
}
