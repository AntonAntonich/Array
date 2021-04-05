package by.anton.array.entity;


import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private static long idincr = 0;
    private long arrayId;
    {
        idincr++;
        arrayId = idincr;
    }
    private static final int DESTINATION_POSITION = 0;

    private int [] array;

    public CustomArray (){}

    public CustomArray(int...numbers) {
        this.array = numbers;
    }

    public void setArray(int...numbers){
        array = numbers;
    }

    public int [] getArray() {
        int [] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, DESTINATION_POSITION, array.length);
        return newArray;
    }

    public int getElementByIndex (int indexOfTargetElement) {
        return array[indexOfTargetElement];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return arrayId == that.arrayId;
    }

    @Override
    public int hashCode() {
        int arrayHash = Arrays.hashCode(array);
        return arrayHash * 31;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(Arrays.toString(array)).append("id: ").append(arrayId);
        return s.toString();
    }
}
