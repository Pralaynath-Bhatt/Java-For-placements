package Basic.patterns;

import java.util.Scanner;

public class randomQuestionsOnRectangles {

    public static void main(String[] args) {
//        problem1();
        problem2();
    }

    private static void problem2() {
        //A B C D
        //A B C D
        //A B C D

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i= 1;i<= n;i++){
            char A = 'A';
            for(int j = 1; j<=m;j++,A++){
                System.out.print(A+" ");

            }
            System.out.println();
        }
    }

    private static void problem1() {
        //1234
        //1234
        //1234
        //1234
        //1234
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
