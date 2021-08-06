package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    UserValidator userValidatorTest = new UserValidator();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateName("Gagan");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    public void givenFirstName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateName("Gag");
        Assertions.assertEquals(false, result);
    }

    @org.junit.jupiter.api.Test

    public void givenFirstName_whenProperShouldReturnFalse() {
        boolean result = userValidatorTest.validateName("ga");
        Assertions.assertEquals(false, result);
    }

    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateLName("Reddy");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateLName("reddy");
        Assertions.assertEquals(false, result);
    }

    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateNumber("+91 8722289619");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateNumber("+91- 28722289619");
        Assertions.assertEquals(false, result);
    }

    @org.junit.jupiter.api.Test

    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validatePass("Ga@xyzzss1");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test

    public void givenEmailId_ValidShould_ReturnTrue() {
        boolean result = userValidatorTest.validateEmail("gagangmail.com.");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    public void givenEmailId_ValidShould_ReturnFalse() {
        boolean result = userValidatorTest.validateEmail("gagan-100.@.gmail.com");
        Assertions.assertEquals(false, result);
    }

}