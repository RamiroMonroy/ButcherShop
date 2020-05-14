package com.udea.butchershop.butchershop.constants;

public class ValidatorConstants {

	//Validators
    public static final String REGEX_EMAIL =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final int MIN_SIZE_EMAIL = 5;
    public static final int MAX_SIZE_EMAIL = 50;
    public static final int MIN_SIZE_LASTNAME=5;
    public static final int MAX_SIZE_LASTNAME=50;
    public static final int MIN_SIZE_TELEPHONE=5;
    public static final int MAX_SIZE_TELEPHONE=20;
    public static final int MIN_SIZE_ADDRESS=5;
    public static final int MAX_SIZE_ADDRESS=24;
    public static final int MIN_SIZE_NAME = 5;
    public static final int MAX_SIZE_NAME = 50;
    public static final int MIN_SIZE_PASSWORD = 8;
    public static final int MAX_SIZE_PASSWORD = 15;

    //Messages
    public static final String BAD_FORMAT_EMAIL_MESSSAGE = "Email bad format";
    public static final String BAD_SIZE_EMAIL_MESSSAGE = "email must be between 5 and 50 characters";
    public static final String BAD_SIZE_ADDRESS_MESSSAGE = "Direccion must be between 5 and 24 characters";
    public static final String BAD_SIZE_LASTNAME_MESSSAGE = "lastname must be between 5 and 50 characters";
    public static final String BAD_SIZE_TELEPHONE_MESSSAGE = "telephone must be between 5 and 20 characters";
    public static final String BAD_SIZE_PASSWORD_MESSAGE = "password must be between 8 and 15 characters";
    public static final String BAD_SIZE_NAME_MESSSAGE = "name must be between 5 and 20 characters";

}
