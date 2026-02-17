import java.util.*;
public class Q23 {
    static String delrep(String s){
        String s1="";
        for(char ch:s.toCharArray()) {

            if (s1.indexOf(ch) == -1)
                s1 += ch;
        }
        return s1;
    }
    static String delrep2(String s){
            String s1 = "";
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(s.toLowerCase().indexOf(Character.toLowerCase(ch)) == i) {
                    s1 += ch;
                }
            }
            return s1;
        }


   /* static String delrep2(String s){
        String s1="";

        for(char ch='a';ch<='z';ch++) {
            int c = 0;
            int index=-1;
            for (int i = 0; i < s.length(); i++) {
                if (Character.toLowerCase(s.charAt(i)) == ch) {
                    c++;
                    index=i;
                }
            }
            if (c == 1)
                s1 +=s.charAt(index);
        }
        return s1;

    */


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a String");
        String s=in.nextLine();
        System.out.println(delrep(s));
        System.out.println(delrep2(s));

    }
}
