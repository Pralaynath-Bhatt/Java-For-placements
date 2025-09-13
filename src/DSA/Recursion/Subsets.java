package DSA.Recursion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printsubset(0,s,"");
    }

    private static void printsubset(int i, String s, String s1) {
    if (i==s.length()){
        System.out.print(s1+" ");;
        return;
    }
    char c = s.charAt(i);
    printsubset(i+1,s,s1+c);
    printsubset(i+1,s,s1);
    }
}
