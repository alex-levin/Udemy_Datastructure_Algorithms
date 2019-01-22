package sort_algorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }


    public static void mergeSort(int[] input, int start, int end) {
        System.out.println("start=" + start + ", end=" + end);

        if (end - start < 2) {
            return;
        }

        int mid = (end + start) / 2;
        System.out.println("mid=" + mid);

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        System.out.println("start=" + start + ", mid=" + mid + ", end=" + end);

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // if there's element left over in the right array, we don't have to copy them to the temp array.
        // input array : {32, 34}, {33, 36}
        // temp array : {32, 33, 34}
        // copy temp array back to input array : {32, 33, 34, 36}

        // However, if there's left over in the left array, we do have to copy them to the temp array.
        // Because the order has to be changed.
        // input array : {32, 36}, {33, 34}
        // temp array : {32, 33, 34} -> {32, 33, 34, 36}
        // copy temp array back to input array : {32, 33, 34, 36}

        // copy left over element in the left array, need to be copy back to input array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        // copy temp array to the input array
        System.arraycopy(temp, 0, input, start, tempIndex);






    }
}
