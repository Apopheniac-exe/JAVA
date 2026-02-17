package Arrays.sorting_techniques;
import java.util.*;
public class Merge_Sort {
    static void mergesort(int low, int high, int[] a) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergesort(low, mid, a);
        mergesort(mid + 1, high, a);
        merge(low, mid, high, a);
    }

    static void merge(int low, int mid, int high, int[] a) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }
        while (left <= mid)
            temp.add(a[left++]);
        while (right <= high)
            temp.add(a[right++]);

        for (int i = low; i <= high; i++)
            a[i] = temp.get(i-low);
    }

    public static void main(String[] args) {
        int[] a={3,5,1,2,8};
        System.out.println(Arrays.toString(a));
        mergesort(0,a.length-1,a);
        System.out.println(Arrays.toString(a));
    }
}

