package ua.training.controller;

import ua.training.controller.util.InputNoteController;
import ua.training.exceptions.DuplicateLoginException;
import ua.training.model.Model;
import ua.training.view.View;

import java.sql.SQLException;
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

        InputNoteController inputNoteController = new InputNoteController(scanner, view);
        boolean finished = false;
        while (!finished){
            try {
                model.addNote(inputNoteController.buildNote());
                finished = true;
            } catch (DuplicateLoginException e) {
                inputNoteController.inputNewLogin();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        view.printResultMessages();

        view.printMessage(model.getNotes().toString());

    }
}
