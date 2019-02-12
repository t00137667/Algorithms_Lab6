public class MyArrays {

    public static int insert(int []values, int currentSize, int pos, int newElement)
    {
        if (currentSize < values.length)
        {
            for (int i = currentSize-1; i >= pos; i--)
            {
                values[i+1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        else
            System.out.println("Could not insert, Array full");
        return currentSize;
    }

    public static int linearSearch(int [] a, int searchKey)
    {
        for (int i=0; i < a.length; i++)
        {
            if (searchKey == a[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] a)
    {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++)
        {
            //find index such that a[index] is the smallest of a[i]…a[a.length-1]
            int index = i;
            int smallest = a[i];

            for (int j = i + 1; j <= a.length-1; j++)
            {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i)
            {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;

            }
        }
    }
    public static void insertionSort(int[] a){
        for (int i = 1; i < a.length; i++){
            int val = a[i];
            int j = i-1;
            while (j>= 0 && a[j] > val){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
    }

    public static int binarySearch(int[] a, int key){
        int min = 0;
        int max = a.length-1;
        int mid;
        boolean found = false;

        while (!found && min <= max){

            mid = (min + max)/2;

            if (a[mid] == key){
                return mid;
            }
            else if (a[mid] < key){
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }

        return -1;

    }
}