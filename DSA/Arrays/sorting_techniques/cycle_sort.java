package Arrays.sorting_techniques;

import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] - 1 != i) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else i++;
        }
    }
}



