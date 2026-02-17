import java.util.*;
public class Compliment {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        while(n>0) {
            list.add(n % 2);
            n /= 2;
        }
        list=list.reversed();
        System.out.println(list);
        List<Integer> lnew= new ArrayList<Integer>();
        for(int i:list) {
            if (i == 0)
                lnew.add(1);
            else
                lnew.add(0);
        }
        System.out.println(lnew);
    }

}
