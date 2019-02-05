package sort_algorithms;

// Challenge #2
// - Change insertion sort so that it uses recursion
// - Sort the usual example array
public class Challenge_2 {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1,-22};

//        insertionSort(intArray);
        insertionRecursiveSort(intArray, 1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

    private static void insertionRecursiveSort(int[] input, int firstUnsortedIdx) {

        if (firstUnsortedIdx == input.length) {
            return;
        }

        for (int i = firstUnsortedIdx; i > 0; i--) {
            if (input[i] <= input[i - 1]) {
                swap(input, i, i - 1);
            }
        }

        System.out.println("Result of call when firstUnsortedIdx = " + firstUnsortedIdx);
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("------------------------------");

        insertionRecursiveSort(input, firstUnsortedIdx + 1);

    }

    private static void insertionSort(int[] input) {

        for (int firstUnsortedIdx = 1; firstUnsortedIdx < input.length; firstUnsortedIdx++) {

            for (int i = firstUnsortedIdx; i > 0; i--) {
                if (input[i] <= input[i - 1]) {
                    swap(input, i, i - 1);
                }
            }
        }
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
