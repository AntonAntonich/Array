package by.anton.array.service;

import by.anton.array.exception.ArrayException;
import by.anton.array.validator.ArrayValidator;

import java.util.Arrays;

public class SortService {
    public int [] bubbleSortService(int [] array) throws ArrayException {
        if(!ArrayValidator.isArrayValid(array)){
            throw new ArrayException();
        }
        for(int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
   public int [] selectionSort(int [] array) throws ArrayException {
       if(!ArrayValidator.isArrayValid(array)){
           throw new ArrayException();
       }
       int min = 0;
       int index = 0;
       boolean flag = false;
       for(int i = 0; i < array.length - 1; i++) {
           min = array[i];
           System.out.println(Arrays.toString(array));
           for (int j = i + 1; j < array.length; j++) {
               if(array[j] < min) {
                   min = array[j];
                   index = j;
                   flag = true;
               }
           }
           if(flag) {
               int tmp = array[i];
               array[i] = array[index];
               array[index] = tmp;
           }
           flag = false;
       }
       return array;
   }

}
