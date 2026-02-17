package Arrays.sorting_techniques;
/*
* Concept is ki ek pivot element lo array mein, then usse first bada and first chota ek-ek element find karo array mein
* chote element ko left mein feko aur bade element ko right mein until j i ko cross na kar jaaye, jaise he j i ko cross
* karega j pivot ke sahi index pe khada hoga aur uss sahi index ke left ke saare element pivot se chote honge aur right
* ke saare element pivot se bade honge. loop terminate ho jayega and then pivot ko uske sahi index(j) pe swap kar denge
* then pivot ka index return karenge aur array ko pivot ke right aur pivot left doh half mein recursively divide kar
* denge then recursively dono half ko tab tak divide karte rahenge aur sort karte rahenge jab tak ek element na bach
* jaaye */
import java.util.*;
public class Quick_sort {
    static void qs(int[]a, int low, int high) {
        if (low < high) {
            int pivot_index = partition(a, low, high);
            qs(a, low, pivot_index - 1);
            qs(a, pivot_index + 1, high);
        }
    }

    static int partition(int[]a,int low, int high){
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j) {
            while (a[i] <= pivot && i <= high - 1)// looks for the first element greater than pivot
                i++;
            while (a[j] > pivot && j >= low + 1)// looks for the first element smaller than pivot
                j--;
            if (i < j) { //if they haven't crossed each other than we swap them, this keeps happening until j crosses i and correct index of pivot is found.
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[low];// Once j has crossed i, j is at the index where pivot should be hence swap.
        a[low] = a[j];
        a[j] = temp;

        return j;// return the correct index of pivot, after this step the entire left half of array will be<=pivot
                //  and the entire right half will be larger than the pivot.

    }
    public static void main(String[] args) {
        int []a={10,4,5,2,7,8,2,1,89};
        System.out.println(Arrays.toString(a));
        qs(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
