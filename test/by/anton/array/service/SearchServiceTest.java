package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchServiceTest {
    SearchService searchService = new SearchService();
    @Test(description = "")
    public void searchMinValueTestPositive(){
        int [] array = {4,10,3};
        try{
            int actual = searchService.searchMinValue(array);
            int expected = 3;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }

    @Test(description = "")
    public void searchMaxValueTestPositive(){
        int [] array = {4,10,3};
        try{
            int actual = searchService.searchMaxValue(array);
            int expected = 10;
            Assert.assertEquals(actual, expected);
        } catch (ArrayException a) {
            Assert.fail();
        }
    }
}
