package by.anton.array.creator;

import by.anton.array.entity.CustomArray;
import by.anton.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayCreatorTest {
    @Test(description = "")
    public void testArrayCreatorPositive(){
        ArrayCreator arrayCreator = new ArrayCreator();
        try {
            CustomArray actual = arrayCreator.creatInstanceCustomArray(45,67,8);
            CustomArray expected = new CustomArray(45,67,8);
            Assert.assertEquals(actual, expected);
        } catch (ArrayException e) {
            Assert.fail();
        }

    }
}
