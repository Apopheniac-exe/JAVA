package Arrays.sorting_techniques;
import java.util.*;
public class Recursive_bubble_sort {
    static void recur(int[] a,int n){
        if(n==1)
            return;
        boolean flag=false;
        int temp;
        for(int i=0;i<n-1;i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                flag = true;
            }
        }
            if (!flag)
                return;
            recur(a, n - 1);
    }

    public static void main(String[] args) {
        int []a={10,4,5,2,7,8,2,1,89};
        System.out.println(Arrays.toString(a));
        recur(a,a.length);
        System.out.println(Arrays.toString(a));
    }

}
