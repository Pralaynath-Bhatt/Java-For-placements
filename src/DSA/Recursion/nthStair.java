package DSA.Recursion;

import java.util.Scanner;

public class nthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(nth(n));
    }

    private static int nth(int n) {
    if(n<3) return n;
    return nth(n-1)+nth(n-2);
    }
}
