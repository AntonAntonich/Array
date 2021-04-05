package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateServiceTest {
    CalculateService calculateService = new CalculateService();
    @Test(description = "")
    public void calculateAverageTestPositive(){
        int [] array = {1,2,3,4,5};

        try{
            int actual = calculateService.calculateAverage(array);
            int expected = 3;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }

    @Test(description = "")
    public void calculateAverageUsingStreamsTestPositive(){
        int [] array = {1,2,3,4,5};
        try{
            int actual = calculateService.calculateAverageUsingStreams(array);
            int expected = 3;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }

    @Test(description = "")
    public void calculateSumTestPositive(){
        int [] array = {1,2,3,4,5};
        try{
            int actual = calculateService.calculateSum(array);
            int expected = 15;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }
    @Test(description = "")
    public void calculatePositiveNumbersTestPositive(){
        int [] array = {-1, 2, -3, 4,-5};
        try{
            int actual = calculateService.calculatePositiveNumbers(array);
            int expected = 2;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }

    @Test(description = "")
    public void calculateNegativeNumbersTestPositive(){
        int [] array = {-1, 2, -3, 4,-5};
        try{
            int actual = calculateService.calculateNegativeNumbers(array);
            int expected = 3;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }

}
