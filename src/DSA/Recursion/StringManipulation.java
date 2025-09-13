package DSA.Recursion;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        String ans="";
        check(str,c,0,ans);
    }

    private static void check(String str, char c, int i,String ans) {
        if(i==str.length()) {
            System.out.print(ans);
            return;
        }
        if(str.charAt(i)!=c)
            ans+=str.charAt(i);
        check(str,c,i+1,ans);

    }
}
