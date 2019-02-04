package sort_algorithms;

import java.util.Arrays;

public class SortingUsingTheJDK {

    public static void main(String[] args) {
        int[] intArrays = {20, 35, -15, 7, 55, 1, -22};

//        Arrays.sort(intArrays);
        Arrays.parallelSort(intArrays);

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(intArrays[i]);
        }
    }
}
