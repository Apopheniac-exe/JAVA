package Arrays.sorting_techniques;

import java.util.Arrays;

public class selection_sort {
    public static void main(String args[])
    {
        int[] arr={0,67,9,56,34};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxindex(arr, last);

                int temp = arr[last];
                arr[last] = arr[max];
                arr[max] = temp;

        }
    }
        static int maxindex(int[] arr, int last) {
            int max = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > arr[max])
                    max = i;
            }
            return max;
        }

}
