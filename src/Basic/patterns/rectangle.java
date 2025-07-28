package patterns;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Rows and columns: ");
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=1;i<=n;i++){
           for(int j = 1;j<=m;j++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}
