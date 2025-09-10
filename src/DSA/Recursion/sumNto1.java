package DSA.Recursion;

import java.util.Scanner;

public class sumNto1 {
    public static int sum(int n,int s){
        if(n==0) return s;
        return sum(n-1,s+n);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n,0));
    }

}
