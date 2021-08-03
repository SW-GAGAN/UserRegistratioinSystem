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
}
