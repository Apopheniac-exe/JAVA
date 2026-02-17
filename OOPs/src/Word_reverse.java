import java.util.*;
public class Word_reverse {
    static String method1(String s){
        StringTokenizer st = new StringTokenizer(s);
        int count=st.countTokens();
        String s1="";
        for(int i=0;i<count;i++) {
            s1 = st.nextToken() + " " + s1;
        }
        return s1;

    }
    static  String method2(String s){
        String s1="";
        int index=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                s1 = s.substring(index, i) + " " + s1;
                index = i + 1;
            }
        }
        s1=s.substring(index,s.length())+" "+s1;
        return s1;
    }
    static String method3(String s){
        String[] s1=s.split(" ");
        String s2="";
        for(int i= s1.length-1;i>=0;i--) {
            s2 = s2 + " " + s1[i];
        }
        return s2.trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s=in.nextLine();
        System.out.println(method1(s));
        System.out.println(method2(s));
        System.out.println(method3(s));
    }

}
