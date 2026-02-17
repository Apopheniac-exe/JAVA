package Arrays.sorting_techniques;
import java.util.*;
public class Recursive_insertion_sort {
    static void recur(int[]a, int i){
        if(i>=a.length-1)
            return;
        int j=i;
        while(j>0 && a[j-1]>a[j]) {
            int temp = a[j - 1];
            a[j - 1] = a[j];
            a[j] = temp;
            j--;
        }
        recur(a,i+1);
    }
    public static void main(String[] args) {
        int []a={10,4,5,2,7,8,2,1,89};
        System.out.println(Arrays.toString(a));
        recur(a,0);
        System.out.println(Arrays.toString(a));
    }
}
