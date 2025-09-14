package DSA.Recursion;

import java.util.Scanner;

public class Consecutive1sExcluded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        go("",n);
    }

    private static void go(String s, int n) {
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0||s.charAt(s.length()-1)=='0'){
            go(s+1,n);
            go(s+0,n);
        }
        else go(s+0,n);
    }
}
