package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();

    @Test
    public void givenFirst_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateLastName("Gagan");
        Assert.assertEquals(result, true);

    }

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateLastName("Reddy");
        Assert.assertEquals(result, true);
    }
    @Test
    public void givenEmailId_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateEmail("xyz@gmail.com");
        Assert.assertEquals(result, true);
    }
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateMobileNumber("+91 8722289619");
        Assert.assertEquals(result, true);
    }
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validatePassword("gaganred");
        Assert.assertEquals(result, true);
    }

}