package ua.training.controller.util;

/**
 * Created by allugard on 25.04.17.
 */
public interface RegularExpression {

    String FIRST_NAME_REG_EX = "[A-Z]{1}[a-z]{1,20}";
    String SECOND_NAME_REG_EX = "[A-Z]{1}[a-z]{1,20}";

    String LOGIN_REG_EX = "[A-Za-z0-9]{1,20}";

    String MOBILE_PHONE_REG_EX = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})";

    String EMAIL_REG_EX = "\\w+@[A-Za-z0-9]+\\.[A-Za-z]{2,64}";

    String CITY_REG_EX = "[A-Z]{1}[a-z]+";
    String STREET_REG_EX = "[A-Z]{1}[a-z]+";
    String NUMBER_HOME_REG_EX = "\\d+";
    String APPARTMENT_NUMBER_REG_EX = "\\d+";

}
