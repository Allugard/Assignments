package org.allugard.training;

/**
 * Created by allugard on 11.04.17.
 */
public class Model {
    private String message="";

    public void addMessage(String message) {
        this.message +=message+" ";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
