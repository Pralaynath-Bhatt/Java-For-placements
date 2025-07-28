package Basic.Loops;

import java.util.Scanner;

public class digitCounting {
    public static void main(String[] args) {

        countDigit();
        sumOfDigit();
    }

    private static void sumOfDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int count=0,sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
            count++;
        }
        System.out.println(sum);
    }

    private static void countDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
