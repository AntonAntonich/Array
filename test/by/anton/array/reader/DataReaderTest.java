package by.anton.array.reader;

import by.anton.array.exception.CustomReaderException;
import by.anton.array.exception.EmptyStringException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataReaderTest {
    public static final String address = "resources/data/array.txt";
    DataReader reader = new DataReader();
    @Test(description = "")
    public void arrayReaderFromFileTestPositive(){
        try {
            String actual = reader.readDataFromFile(address);
            String expected  = "abc,dfg,d " +
                                "1d,3,49,4 " +
                                "9,6,5,4";
            Assert.assertEquals(actual, expected);
        } catch (CustomReaderException | EmptyStringException e) {
            Assert.fail();
        }
    }

    @Test(description = "", expectedExceptions = EmptyStringException.class)
    public void emptyStringAddressReaderTestPositive() throws EmptyStringException, CustomReaderException {
        reader.readDataFromFile(null);
    }

    @Test(description = "", expectedExceptions = EmptyStringException.class)
    public void nullStringAddressReaderTestPositive() throws EmptyStringException, CustomReaderException {
        reader.readDataFromFile("");
    }

    @Test(description = "", expectedExceptions = CustomReaderException.class)
    public void wrongAddressReaderTestPositive() throws EmptyStringException, CustomReaderException {
        reader.readDataFromFile("resourdfgdfrces/data/array.txt");
    }
}
