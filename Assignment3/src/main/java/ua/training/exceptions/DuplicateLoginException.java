package ua.training.exceptions;

/**
 * Created by allugard on 26.04.17.
 */
public class DuplicateLoginException extends Exception{

    public DuplicateLoginException(){
        super();
    }

    public DuplicateLoginException(String msg){
        super(msg);
    }
}
