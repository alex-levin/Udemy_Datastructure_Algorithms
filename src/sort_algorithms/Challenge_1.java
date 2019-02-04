package sort_algorithms;

//Challenge #1
//- Modify the merge sort algorithm so that it sorts integers in DESCENDING order
//- Use the usual example array

public class Challenge_1 {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1,-22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

    private static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        int i = start;
        int j = mid;
//        int[] temp = new int[end];
        int[] temp = new int[end - start];
        int tempIdx = 0;

        //left:35,20,1 right:35,-15
        //35, 35, 20,-15
        while (i < mid && j < end) {
//            if (input[i] >= input[j]) {
//                temp[tempIdx++] = input[i++];
//            } else {
//                temp[tempIdx++] = input[j++];
//            }
            temp[tempIdx++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        while (i < mid) {
            temp[tempIdx++] = input[i++];
        }

//        while (j < end) {
//            temp[tempIdx++] = input[j++];
//        }

//        System.arraycopy(temp, 0, input, start, end - start);
        System.arraycopy(temp, 0, input, start, tempIdx);


    }
}
