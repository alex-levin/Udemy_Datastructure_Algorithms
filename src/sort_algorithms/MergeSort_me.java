package sort_algorithms;

public class MergeSort_me {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, 7);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        // merge(1, 2, 3) : {35} {-15} => {20, -15, 35, 7, 55, 1, -22}
        // merge(0, 1, 3) : {20}, {-15, 35} => {-15, 20, 35, 7, 55, 1, -22}
        // merge(3, 4, 5) : {7}, {55} => no need to merge {-15, 20, 35, 7, 55, 1, -22}
        // merge(5, 6, 7) : {1}, {-22} => {-15, 20, 35, 7, 55, -22, 1}
        // merge(3, 5, 7) : {7, 55}, {-22, 1} => {-15, 20, 35, -22, 1, 7, 55}
        // merge(0, 3, 7) : {-15, 20, 35}, {-22, 1, 7, 55} => {-22, -15, 1, 7, 20, 35, 55}
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // merge(1, 2, 3)
        // i = 1, j = 2, mid = 2, end = 3
        // {35, -15}
        // temp = {-15}
        // i = 1, j = 3
        // input : {20, from temp, from input(left part)}

        // merge(0, 1, 3)
        // i = 0, j = 1, mid = 1, end = 3
        // {20, -15, 35
        // temp = {-15, 20}
        // i = 1, j = 2
        // input : {-15(from temp), 20(from temp), 35(from input itself)}
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
