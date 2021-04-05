package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import by.anton.array.validator.ArrayValidator;

public class SubstituteService {
    public int[] replace(int [] array) throws ArrayException {
            if(!ArrayValidator.isArrayValid(array)) {
                throw new ArrayException();
            }
        for(int i = 0; i < array.length;i++) {
            if(array[i] < 0) {
                array[i] = array[i] * -1;
            }
        }
        return array;
    }
}
