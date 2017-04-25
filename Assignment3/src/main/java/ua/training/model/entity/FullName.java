package ua.training.model.entity;

import ua.training.util.GlovalValues;

/**
 * Created by allugard on 25.04.17.
 */
public class FullName {

    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(GlovalValues.SPACE).append(lastName.charAt(0)).append(GlovalValues.DOT);
        return sb.toString();
    }
}
