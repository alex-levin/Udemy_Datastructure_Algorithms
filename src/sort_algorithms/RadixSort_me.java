package sort_algorithms;

public class RadixSort_me {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5792};

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }

    }

    public static void radixSort(int[] input, int radix, int width) {

        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        int[] countArray = new int[radix];
        for (int i = 0; i < input.length; i++) {
            countArray[getDigit(input[i], position, radix)]++;
        }

//        printArray(countArray);

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

//        printArray(countArray);

        int[] temp = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            temp[--countArray[getDigit(input[i], position, radix)]] = input[i];
        }

        for (int i = 0; i < temp.length; i++) {
            input[i] = temp[i];
        }

    }

    public static int getDigit(int value, int position, int radix) {
        return value / (int)Math.pow(radix, position) % radix;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
