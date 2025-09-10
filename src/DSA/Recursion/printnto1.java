package DSA.Recursion;

import java.util.Scanner;

public class printnto1{
    public static void printn(int n){
        if(n==1){
            System.out.print(n);
        }
        else {
            System.out.print(n+" ");
            printn(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printn(n);
    }
}
