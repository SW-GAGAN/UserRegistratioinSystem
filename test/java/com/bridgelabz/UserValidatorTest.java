package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();
    @Test
    public void givenFirst_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateName("Gagan");
        Assert.assertEquals(result,true);

    }
}

