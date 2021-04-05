package by.anton.array.parser;

import by.anton.array.exception.EmptyStringException;
import by.anton.array.validator.CorrectIntegerArrayValidator;
import by.anton.array.validator.EmptyStringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StringToIntegerArrayParser {
    private final static String LINES_SEPARATOR = " ";
    private final static String ELEMENTS_SEPARATOR = ",";

    static Logger logger = LogManager.getLogger(StringToIntegerArrayParser.class);

    public  int [] parseStringToIntegerArray(String data)
            throws EmptyStringException {
        if(EmptyStringValidator.isEmptyString(data)) {
            throw new EmptyStringException();
        }
        int [] array = null;
        String [] supposedArrays = data.split(LINES_SEPARATOR);
        int counter = 0;
        String supposedArray;

        while(counter < supposedArrays.length) {
            supposedArray = supposedArrays[counter];
            if(CorrectIntegerArrayValidator.isIntegerArray(supposedArray)){
                array = stringToArray(supposedArray);
                break;
            }
            counter++;
        }
        return array;
    }

    private int [] stringToArray(String correctNumbers) {
        String [] numbers = correctNumbers.split(ELEMENTS_SEPARATOR);
        int [] integerArray = new int[numbers.length];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = Integer.parseInt(numbers[i]);
        }
        return integerArray;
    }
}
