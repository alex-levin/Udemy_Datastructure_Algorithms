package sort_algorithms;

public class InsertionSort_me {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 1; i < intArray.length; i++) {

            int j = i;
            while (j > 0 && intArray[j] < intArray[j - 1]) {
                swap(intArray, j, j - 1);
                j = j - 1;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
