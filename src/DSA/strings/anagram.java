package DSA.strings;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t = sc.nextLine();
        boolean isIt = isAnagram(s,t);
        System.out.println(isIt);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] a= s.toCharArray();
        char[] b= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
