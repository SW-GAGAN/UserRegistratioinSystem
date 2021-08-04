package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();


    @Test
    public void givenFirst_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateFirstName("Gagan");
        Assert.assertEquals(true,result);

    }

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateLastName("Reddy");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmailId_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateEmail("xyz@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateMobileNumber("+91-8722289617");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validatePassword("Gaganreddy");
        Assert.assertEquals(true,result);
    }

}
