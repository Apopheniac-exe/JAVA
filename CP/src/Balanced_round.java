import java.util.*;
public class Balanced_round {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            long[] a = new long[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            int c = 1;
            int largest=1;
            for (int i = 1; i < n; i++) {
                if ((a[i] - a[i-1])<= k)
                    c++;
                else
                    c=1;

                if(c>largest)
                    largest=c;
            }
            System.out.println(n-largest);
        }
    }
}
