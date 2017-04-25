package ua.training;


import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.model.entity.Note;
import ua.training.util.GlovalValues;
import ua.training.view.View;

/**
 * Created by allugard on 16.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
//        controller.processUser();
    }
}
