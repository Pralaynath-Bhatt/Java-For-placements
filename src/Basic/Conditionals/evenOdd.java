package Basic.Conditionals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("Its Even");
        }
        else {
            System.out.println("Its Odd");
        }
    }
}
