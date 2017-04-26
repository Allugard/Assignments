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

    List <Note> notes;

    public Model(){
        notes = new ArrayList<>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> note) {
        this.notes = note;
    }

    public void addNote(Note note) {
        notes.add(note);
    }
}
