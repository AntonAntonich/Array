package by.anton.array.validator;

import by.anton.array.exception.EmptyStringException;
import static by.anton.array.validator.EmptyStringValidator.isEmptyString;


public class CorrectIntegerArrayValidator {
    private static final String SEPARATOR = ",";

    public static boolean isIntegerArray(String supposedArray) throws EmptyStringException {
        if(isEmptyString(supposedArray)){
            throw new EmptyStringException();
        }

        String[] elementsOfArray = supposedArray.split(SEPARATOR);
        int flag = 0;
        try {
            for (String element : elementsOfArray) {
                Integer.parseInt(element);
            }
        } catch (NumberFormatException n) {
            flag = -1;
        }
        return flag == 0;
    }
}
