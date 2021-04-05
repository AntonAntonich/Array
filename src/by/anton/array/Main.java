package by.anton.array;


import by.anton.array.creator.ArrayCreator;
import by.anton.array.entity.CustomArray;
import by.anton.array.exception.ArrayException;
import by.anton.array.exception.CustomReaderException;
import by.anton.array.exception.EmptyStringException;
import by.anton.array.parser.StringToIntegerArrayParser;
import by.anton.array.reader.DataReader;

public class Main {
    public static void main(String[] args) {
        String dat = readArray();
        int [] array = parsStringToArray(dat);
        CustomArray customArray = createInstance(array);

        CustomArray customArray1 = new CustomArray();
        System.out.println(customArray + " " + customArray1);
    }
    static String readArray(){
        DataReader reader = new DataReader();
        String data = null;
        try {
            data = reader.readDataFromFile("resources/data/array.txt");
        } catch (CustomReaderException e) {

        } catch (EmptyStringException e) {

        }
        return data;
    }

    static int [] parsStringToArray(String data){
        StringToIntegerArrayParser parser = new StringToIntegerArrayParser();
        int array [] = null;
        try {
            array = parser.parseStringToIntegerArray(data);
        } catch (EmptyStringException e) {

        }
        return array;
    }

    static CustomArray createInstance(int array []) {
        ArrayCreator arrayCreator = new ArrayCreator();
        CustomArray customArray = null;

        try {
            customArray = arrayCreator.creatInstanceCustomArray(array);
        } catch (ArrayException e) {

        }
        return customArray;
    }
}
