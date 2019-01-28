package sort_algorithms;

public class QuickSort_me {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, 7);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }


    }
    
    /* 
    quickSort(start=0,end=7)
    pivotIndex=4
    quickSort(start=0,end=4)
    pivotIndex=0
    quickSort(start=0,end=0)
    quickSort(start=1,end=4)
    pivotIndex=2
    quickSort(start=1,end=2)
    quickSort(start=3,end=4)
    quickSort(start=5,end=7)
    pivotIndex=6
    quickSort(start=5,end=6)
    quickSort(start=7,end=7)
    -22 -15 1 7 20 35 55 
     */

    public static void quickSort(int[] input, int start, int end) {
        System.out.println("quickSort(start=" + start + ",end=" + end + ")");

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        System.out.println("pivotIndex=" + pivotIndex);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) {

            }
            if (i == j) {
                break;
            }
            input[i] = input[j];

            //{20, 35, -15, 7, 55, 1, -22};
//            System.out.println("i=" + i + ", j=" + j);
//            printArray(input);

            while (i < j && input[++i] <= pivot) {

            }
            if (i == j) {
                break;
            }
            input[j] = input[i];

//            System.out.println("i=" + i + ", j=" + j);
//            printArray(input);

        }

        input[j] = pivot;

        return j;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
