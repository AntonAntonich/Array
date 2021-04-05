package by.anton.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyStingValidatorTest {
    @Test(description = "")
    public void nullEmptyStringValidatorTest(){
        String  testString = null;
        boolean actual = EmptyStringValidator.isEmptyString(testString);
        Assert.assertFalse(actual);
    }

    @Test(description = "")
    public void emptyEmptyStringValidatorTest(){
        String  testString = "";
        boolean actual = EmptyStringValidator.isEmptyString(testString);
        Assert.assertFalse(actual);
    }
}
