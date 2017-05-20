package ua.training.dao;

import ua.training.exceptions.DuplicateLoginException;
import ua.training.model.entity.Note;

import java.sql.SQLException;

/**
 * Created by allugard on 26.04.17.
 */
public interface NoteDao {
    void add(Note note) throws SQLException, DuplicateLoginException;
}
