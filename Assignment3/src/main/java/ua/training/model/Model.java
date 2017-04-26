package ua.training.model;

import ua.training.dao.NoteDao;
import ua.training.dao.impl.NoteDaoJdbcImpl;
import ua.training.exceptions.DuplicateLoginException;
import ua.training.model.entity.Note;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Created by allugard on 16.04.17.
 */
public class Model {

    private List <Note> notes;
    private NoteDao noteDao;

    public Model() {
        notes = new ArrayList<>();
        noteDao = new NoteDaoJdbcImpl();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> note) {
        this.notes = note;
    }

    public void addNote(Note note) throws DuplicateLoginException, SQLException {
        noteDao.add(note);
        notes.add(note);
    }
}
