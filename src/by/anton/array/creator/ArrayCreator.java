package by.anton.array.creator;

import by.anton.array.entity.CustomArray;
import by.anton.array.exception.ArrayException;

import static by.anton.array.validator.ArrayValidator.isArrayValid;

public class ArrayCreator {
    private static final String ERROR_MESSAGE = "Array is empty or 'NULL' !!!";
    public CustomArray creatInstanceCustomArray(int...numbers) throws ArrayException {
        if(!isArrayValid(numbers)){
            throw new ArrayException(ERROR_MESSAGE);
        }
        CustomArray customArray = new CustomArray(numbers);
        return customArray;
    }
}
