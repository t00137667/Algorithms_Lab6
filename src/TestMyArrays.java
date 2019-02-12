import java.util.Arrays;

public class TestMyArrays {
    public static void main(String[] args) {
        int currentSize = 6;
        int[] values = new int[10];
        values[0] = 5;
        values[1] = 27;
        values[2] = 56;
        values[3] = 35;
        values[4] = 12;
        values[5] = 67;
        currentSize = MyArrays.insert(values,currentSize,2,99);
        currentSize = MyArrays.insert(values,currentSize,6,75);
        currentSize = MyArrays.insert(values,currentSize,5,80);
        currentSize = MyArrays.insert(values,currentSize,2,23);
        currentSize = MyArrays.insert(values,currentSize,2,50);

        System.out.println("Array Contents");

        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

        MyArrays.insertionSort(values);

        System.out.println(Arrays.toString(values));

        int position = MyArrays.binarySearch(values, 56);
        if (position >= 0){
            System.out.println("The key is in position : " + position + " in the array.");
        }
        else
            System.out.println("Item not found");

        position =  MyArrays.binarySearch(values, 70);
        if (position >= 0){
            System.out.println("The key is in position : " + position + " in the array.");
        }
        else
            System.out.println("Item not found");

    }
}