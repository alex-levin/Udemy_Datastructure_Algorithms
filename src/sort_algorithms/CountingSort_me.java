package sort_algorithms;

public class CountingSort_me {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        printArray(intArray);
//        countingSort(intArray, 0, 10);
//        countingSort(intArray, 1, 10);
        countingSort(intArray, 2, 10);
        printArray(intArray);

    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        printArray(countArray);
        // {0, 2 ,1, 1, 1, 0, 1, 2, 1, 1}

        int k = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                int j = countArray[i]; //j=2,j=1,..., j=1
                while (j > 0) {
                    input[k++] = i + min; //input[0]=2, input[1]=2, input[2]=3, ..input[9]=10
                    j--;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
