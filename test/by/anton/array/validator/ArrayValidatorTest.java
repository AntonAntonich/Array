package by.anton.array.validator;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    @Test(description ="")
    public void testNullArrayValidatorTestPositive(){
        int [] array = null;
        boolean actual = ArrayValidator.isArrayValid(array);
        Assert.assertFalse(actual);
    }

    @Test(description ="")
    public void testEmptyArrayValidatorTestPositive(){
        int [] array = {};
        boolean actual = ArrayValidator.isArrayValid(array);
        Assert.assertFalse(actual);
    }
}
