package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationExceptionTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistration validator = new UserRegistration();
        try{
            validator.validateFirstName(null);
        }
        catch (UserRegistrationException e){
            assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistration validator = new UserRegistration();
        try{
            validator.validateLastName(null);
        }
        catch (UserRegistrationException e){
            assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenEmailID_WhenProper_ShouldReturnTrue(){
        UserRegistration validator = new UserRegistration();
        try{
            validator.validateEmailId(null);
        }
        catch (UserRegistrationException e){
            assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenMobileNO_WhenProper_ShouldReturnTrue(){
        UserRegistration validator = new UserRegistration();
        try{
            validator.validateMobileNo(null);
        }
        catch (UserRegistrationException e){
            assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserRegistration validator = new UserRegistration();
        try{
            validator.validatePassword(null);
        }
        catch (UserRegistrationException e){
            assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
}
