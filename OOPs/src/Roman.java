import java.util.*;
public class Roman {
    static String covertRoman(int x){
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String s1="";
        for(int i=0;i< values.length;i++) {
            while (x >= values[i]) {
                s1 += symbols[i];
                x -= values[i];
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(covertRoman(x));

    }
}
