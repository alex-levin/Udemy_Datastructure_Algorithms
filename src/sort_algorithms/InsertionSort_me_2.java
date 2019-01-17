package sort_algorithms;

public class InsertionSort_me_2 {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIdex = 1; firstUnsortedIdex < intArray.length; firstUnsortedIdex++) {

            int i = firstUnsortedIdex;
            while (i > 0 && intArray[i - 1] > intArray[i]) {
                swap(intArray, i, i - 1);
                i--;
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
