package by.anton.array.validator;

import by.anton.array.exception.EmptyStringException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CorrectIntegerArrayValidatorTest {
    @Test()
    public void correctIntegerValidatorTestPositive(){
        String supposedArray = "1,3d,s";
        try {
            boolean actual = CorrectIntegerArrayValidator.isIntegerArray(supposedArray);
            Assert.assertFalse(actual);
        } catch (EmptyStringException e) {
            Assert.fail();
        }

    }
}
