package Loops;

import java.util.Scanner;

public class gp {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n= sc.nextInt();
        int a=1,d=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=d;
        }
    }
}
