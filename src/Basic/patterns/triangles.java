package Basic.patterns;

import java.util.Scanner;

public class triangles {
    public static void main(String[] args) {
        //basic();
        //numbered();
        //alphabets();
//        alphanumeric();
        //reverseBasic();
        //reverseNumbered();
        reverseAlphaNumeric();

    }

    private static void reverseAlphaNumeric() {
        //1 2 3 4 5
        //A B C D
        //1 2 3
        //A B
        //1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        for(int i = 1 ; i <= n ; i++, k--){
            char A = 'A';
            if(k%2==0){
                    for(int j = 1; j<= n+1-i;j++,A++){
                        System.out.print(A+" ");
                    }
                }
            else{
                for(int j = 1; j<= n+1-i;j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    private static void reverseNumbered() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1; j<= n+1-i;j++){
                    System.out.print(n-i+1);
                }
                System.out.println();
            }

    }

    private static void reverseBasic() {
        //****
        //***
        //**
        //*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
                for (int j = 1;j<=n+1-i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    private static void alphanumeric() {
        //1
        //A B
        //1 2 3
        //A B C D
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            char A = 'A';
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++, A++) {
                    System.out.print(A + " ");
                }
            } else {
                for (int j = 1; j <= i; j++, A++) {
                    System.out.print(j + " ");
                }
            }
                System.out.println();

        }
    }

    private static void alphabets(){
        //A
        // A B
        //A B C
        //A B C D
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            char A = 'A';
            for (int j = 1 ; j<=i; j++,A++){
                System.out.print(A+" ");
            }
            System.out.println();
        }
    }

    private static void numbered() {
        //1
        //1 2
        //1 2 3
        //1 2 3 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void basic() {
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
