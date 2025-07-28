package Basic.Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        for(int i = 2; i<n;i++){
            if(n%i == 0){
                System.out.println("False");
                x++;
                break;
            }
        }
        if(x==0){
            System.out.println("True");
        }
    }
}
