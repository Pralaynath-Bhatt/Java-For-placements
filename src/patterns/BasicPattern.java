package patterns;

import java.util.Scanner;

public class BasicPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Of *: ");
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
