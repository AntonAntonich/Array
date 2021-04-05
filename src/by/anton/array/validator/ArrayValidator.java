package by.anton.array.validator;

public class ArrayValidator {
    public static boolean isArrayValid(int [] array) {
        boolean result = (array != null) && (array.length != 0);
        return result;
    }
}
