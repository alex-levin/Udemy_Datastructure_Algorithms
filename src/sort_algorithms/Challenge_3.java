package sort_algorithms;


// Challenge #3
//- Sort the following values using radix sort: "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"
// All values are int the lowercase, so don't worry about uppercasing/lowercasing the values
public class Challenge_3 {

    public static void main(String[] args) {
        String[] input = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

//        radixSort(input, 5, 26);
//
//        printStringArray(input);

        System.out.println(getCharNum(input[2], 0));
        System.out.println(input[2].charAt(0));
        System.out.println((int)input[2].charAt(0));
        System.out.println((int)input[2].charAt(0) - "a".charAt(0));
        System.out.println((int)input[2].charAt(0) - 'a');



    }

    private static void radixSort(String[] input, int width, int radix) {

        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(String[] input, int position, int radix) {
        int[] countArray = new int[radix];


        for (int i = 0; i < input.length; i++) {
            countArray[getCharNum(input[i], position)]++;
        }

//        printArray(countArray);

        for (int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j - 1];
        }
//        printArray(countArray);

        String[] temp = new String[input.length];
        for (int k = input.length - 1; k >= 0; k--) {
            temp[--countArray[getCharNum(input[k], position)]] = input[k];
        }

        for (int l = 0; l < temp.length; l++) {
            input[l] = temp[l];
        }

        printStringArray(input);

    }

    private static int getCharNum(String src, int position) {
//        String s = src.substring(position, position + 1);
//        char c = s.charAt(0);
//
//        return Character.getNumericValue(c) - Character.getNumericValue('a');

        return src.charAt(position) - 'a';
    }


    private static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }


    private static void printStringArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
