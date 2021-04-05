package by.anton.array.service;

import by.anton.array.exception.ArrayException;

import by.anton.array.validator.ArrayValidator;

import java.util.stream.IntStream;


public class CalculateService {
    private final  int INITIAL_RESULT = 0;


    public int calculateAverage(int [] array) throws ArrayException {
            if(!ArrayValidator.isArrayValid(array)) {
                throw new ArrayException();
            }
        int sum = calculateSum(array);
        return sum/array.length;
    }

    public int calculateAverageUsingStreams(int [] array) throws ArrayException {
        if(!ArrayValidator.isArrayValid(array)) {
            throw new ArrayException();
        }
        int sum = IntStream.of(array).sum();
        int amount  = (int) IntStream.of(array).count();
        int result = (int) sum/amount;
        return result;
    }

    public int calculateSum(int [] array) throws ArrayException{
        if(!ArrayValidator.isArrayValid(array)) {

            throw new ArrayException();
        }
        int result = INITIAL_RESULT;
        for(int index = 0; index < array.length; index++) {
            result += array[index];
        }
        return result;
    }

    public int calculateSumUsingStreams(int [] array) throws ArrayException{
        if(!ArrayValidator.isArrayValid(array)) {
            throw new ArrayException();
        }
        int sum = IntStream.of(array).sum();
        return sum;
    }

    public int calculatePositiveNumbers(int [] array) throws ArrayException {
            if(!ArrayValidator.isArrayValid(array)) {
                throw new ArrayException();
            }
        int numberPositiveNum = INITIAL_RESULT;
        for (int index = 0; index < array.length; index++) {
            if(array[index] > 0) {
                numberPositiveNum++;
            }
        }
        return numberPositiveNum;
    }

    public int calculatePositiveNumbersUsingStreams(int [] array) throws ArrayException {
        if(!ArrayValidator.isArrayValid(array)) {
            throw new ArrayException();
        }
        int positiveNumbersAmount = (int) IntStream.of(array).filter(e -> e > 0).count();
        return positiveNumbersAmount;
    }

    public int calculateNegativeNumbers(int [] array) throws ArrayException {
            if(!ArrayValidator.isArrayValid(array)){
                throw new ArrayException();
            }
        int numberNegativeNum = INITIAL_RESULT;
        for (int index = 0; index < array.length; index++) {
            if(array[index] < 0) {
                numberNegativeNum++;
            }
        }
        return numberNegativeNum;
    }

    public int calculateNegativeNumbersUsingStreams(int [] array) throws ArrayException {
        if(!ArrayValidator.isArrayValid(array)) {
            throw new ArrayException();
        }
        int negativeNumbersAmount = (int) IntStream.of(array).filter(e -> e < 0).count();
        return negativeNumbersAmount;
    }

}
