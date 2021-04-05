package by.anton.array.validator;

public class EmptyStringValidator {
    public static boolean isEmptyString(String string){
        boolean result = (string == null) || (string.isEmpty());
            return result;
    }
}
