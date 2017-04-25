package ua.training.model;

import ua.training.model.entity.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Created by allugard on 16.04.17.
 */
public class Model {

    Note note;

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
