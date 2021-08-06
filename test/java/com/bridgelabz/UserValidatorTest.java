package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    UserValidator userValidatorTest = new UserValidator();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateName("Gagan");
        Assertions.assertEquals(true,result);}

    @org.junit.jupiter.api.Test
    public void givenFirstName_whenProper_shouldReturnFalse() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateName("gagan");
        Assertions.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenFirstName_whenProperShouldReturnFalse() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateName("Ga");
        Assertions.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateLName("Reddy");
        Assertions.assertEquals(true,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateLName("reddy");
        Assertions.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnTrue() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateNumber("+91 1235468844");
        Assertions.assertEquals(true, result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnFalse() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateNumber("+91-1235468844");
        Assertions.assertEquals(false, result);}
    @org.junit.jupiter.api.Test

    public void givenPassword_whenProper_shouldReturnTrue() throws InvalidUserDetails {
        boolean result = userValidatorTest.validatePass("Ja@xyzzss1");
        Assertions.assertEquals(true, result);}
    @org.junit.jupiter.api.Test

    public void givenEmailId_ValidShould_ReturnTrue() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateEmail("abc100@gmail.com.");
        Assertions.assertEquals(true, result);
    }
    @org.junit.jupiter.api.Test
    public void givenEmailId_ValidShould_ReturnFalse() throws InvalidUserDetails {
        boolean result = userValidatorTest.validateEmail("abc-100.@.gmail.com");
        Assertions.assertEquals(false, result);
    }

}