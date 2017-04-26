package ua.training.dao.impl;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import ua.training.dao.NoteDao;
import ua.training.dao.util.DataSource;
import ua.training.exceptions.DuplicateLoginException;
import ua.training.model.entity.Note;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by allugard on 26.04.17.
 */
public class NoteDaoJdbcImpl implements NoteDao {

    private DataSource dataSource;

    public NoteDaoJdbcImpl(){
        dataSource = DataSource.MySqlDataSource();
    }

    @Override
    public void add(Note note) throws SQLException, DuplicateLoginException {
        String sql = "INSERT INTO `NoteBook`.`Note`" +
                " (`first_name`, `last_name`, `login`, `email`, `phone`, `city`, `street`, `house_number`, `appartment_number`)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement statement;

        try (Connection connection = dataSource.getConnection()) {
            statement = connection.prepareStatement(sql);
            statement.setString(1, note.getFullName().getFirstName());
            statement.setString(2, note.getFullName().getLastName());
            statement.setString(3, note.getLogin());
            statement.setString(4, note.getEmail());
            statement.setString(5, note.getPhone());
            statement.setString(6, note.getAddress().getCity());
            statement.setString(7, note.getAddress().getStreet());
            statement.setString(8, note.getAddress().getHouseNumber());
            statement.setString(9, note.getAddress().getApartmentNumber());
            statement.execute();
            statement.close();
        }catch (MySQLIntegrityConstraintViolationException e){
            throw new DuplicateLoginException();
        }
    }
}
