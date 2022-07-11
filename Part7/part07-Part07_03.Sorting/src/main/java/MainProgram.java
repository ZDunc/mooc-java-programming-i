
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i: array) {
            if(i < smallest)
                smallest = i;
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[smallest])
                smallest = i;
        }

        return smallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if(table[i] < table[smallest])
                smallest = i;
        }

        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int counter = 0;

        while (counter < array.length) {
            int smallestIndex = indexOfSmallestFrom(array, counter);

            if (counter == smallestIndex) {
                counter++;
            } else {
                swap(array, counter, smallestIndex);
                counter++;
            }
        }
    }
}
    

