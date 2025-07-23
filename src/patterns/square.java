package patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of *: ");
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
