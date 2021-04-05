package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import by.anton.array.validator.ArrayValidator;

public class SearchService {

    public int searchMinValue (int [] array) throws ArrayException{
            if(!ArrayValidator.isArrayValid(array)) {
                throw new ArrayException();
            }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int searchMaxValue (int [] array)throws ArrayException {
            if(!ArrayValidator.isArrayValid(array)) {
                throw new ArrayException();
            }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
