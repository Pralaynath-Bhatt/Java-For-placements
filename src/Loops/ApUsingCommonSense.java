package Loops;

import java.util.Scanner;

public class ApUsingCommonSense {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n= sc.nextInt();
        int a=4,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
