package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import by.anton.array.service.SortService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortServiceTest {
    SortService sortService = new SortService();
    @Test(description = "")
    public void bubbleSortTestPositive(){
        int [] array = {10, 9, 3, -1 , 2};

        try {
            int [] actual = sortService.bubbleSortService(array);
            int [] expected = {-1, 2, 3, 9, 10};
            Assert.assertEquals(actual, expected);
        }catch (ArrayException a){
            Assert.fail();
        }
    }

    @Test(description = "")
    public void selectionSortTestPositive(){
        int [] array = {10, 9, 3, -1 , 2};

        try {
            int [] actual = sortService.selectionSort(array);
            int [] expected = {-1, 2, 3, 9, 10};
            Assert.assertEquals(actual, expected);
        }catch (ArrayException a){
            Assert.fail();
        }
    }
}
