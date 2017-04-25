package main.java.ua.training.controller;

import main.java.ua.training.controller.util.InputNoteController;
import main.java.ua.training.model.Model;
import main.java.ua.training.view.View;

import java.util.Scanner;

/**
 * Created by allugard on 25.04.17.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser() {

        Scanner scanner = new Scanner(System.in);

        model.setNote(new InputNoteController(scanner, view).buildNote());

        view.printResultMessages();

        view.printMessage(model.getNote().toString());

    }
}
