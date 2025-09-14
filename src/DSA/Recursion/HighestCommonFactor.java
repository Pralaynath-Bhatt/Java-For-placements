package DSA.Recursion;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf2(a,b));
    }

    private static int  hcf2(int a, int b) {
        if(b%a==0) return a;
        return hcf2(b%a,a);

    }

    private static int hcf(int a, int b) {
        for(int i =Math.min(a,b);i>=1;i--){
            if((a%i==0)&&(b%i==0)){
                return i;
            }
        }
        return -1;
    }

}
