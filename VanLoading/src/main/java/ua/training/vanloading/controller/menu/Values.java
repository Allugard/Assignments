package main.java.ua.training.project.controller.menu;

/**
 * Created by allugard on 10.05.17.
 */
public interface Values {
    String EXIT_CODE = "0";
    String  LOAD_VAN = "1";
    String  PRINT_VAN = "2";
    String SELECT_PRODUCT="3";
    String CHANGE_LANGUAGE ="9";

    Double ZERO = 0.0;
    Double ONE = 1.0;

    String REG_EX_CODE = "\\d";
    String REG_EX_HUMIDITY = "-1|0+\\.\\d+";
    String REG_EX_SCENT = "-1|\\d+\\.\\d+|\\d+";
    String REG_EX_CAPACITY = "\\d+";
}