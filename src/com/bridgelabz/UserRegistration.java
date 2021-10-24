package com.bridgelabz;

import java.util.regex.Pattern;

/**
 * Author :-Sunanda Shil
 * Date:-24/10/21
 */

public class UserRegistration {
    //Defining pattern for Name,Mail,MobileNumber,Password
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String EMAIL_ID_PATTERN = "[a-zA-Z0-9]+[.][a-zA-Z0-9]*[@][b][l][.][c][o][.][in]*";
    private static final String EMAIL_ID_PATERN = "[a-zA-Z0-9]*[@][b][l][.][c][o][m]*";
    private static final String MOBILE_NUMBER_PATTERN = "[9][1] [1-9][0-9]{9}";
    private static final String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";

//For first name validation
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        try {
            if (firstName.length() == 0) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "First name cant be empty");
            }
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            return pattern.matcher(firstName).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "First name cant be null");
        }
    }
//for lastname validation
    public boolean validateLastName(String lastName) throws UserRegistrationException {
        try {
            if (lastName.length() == 0) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "First name cant be empty");
            }
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            return pattern.matcher(lastName).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "First cant be null");
        }
    }
//For Email id validation
    public boolean validateEmailId(String emailId) throws UserRegistrationException {
        try {
            if (emailId.length() == 0) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Email id cant be empty");
            }
            Pattern pattern = Pattern.compile(EMAIL_ID_PATERN);
            return pattern.matcher(emailId).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Email id cant be null");
        }
    }
//for mobile number validation
    public boolean validateMobileNo(String mobileNo) throws UserRegistrationException {
        try {
            if (mobileNo.length() == 0) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Mobile number cant be empty");
            }
            Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
            return pattern.matcher(mobileNo).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile number cant be null");
        }
    }
//for password validation
    public boolean validatePassword(String password) throws UserRegistrationException {
        try {
            if (password.length() == 0) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Mobile number cant be empty");
            }
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            return pattern.matcher(password).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile number cant be null");
        }
    }
}
