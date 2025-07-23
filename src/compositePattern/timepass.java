package compositePattern;


import java.util.Scanner;

public class timepass {
    public static void main(String[] args) {
        //patterns1();
        //nstnsp();
        //patterns2();
        //patterns3();
        //starBridge();//hw
        //testpattern();
        //numberBridge();
        diamond();

    }

    private static void diamond() {
        //          *
        //        * * *
        //      * * * * *
        //    * * * * * * *
        //  * * * * * * * * *
        //* * * * * * * * * * *
        //  * * * * * * * * *
        //    * * * * * * *
        //      * * * * *
        //        * * *
        //          *

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for (int j = 1;j<=nsp;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
        nsp=1;
        nst=nst-4;
        for(int i=1;i<n;i++){
            for (int j = 1;j<=nsp;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }

    private static void numberBridge() {
//        1 2 3 4 5 6 7 8 9
//        1 2 3 4   6 7 8 9
//        1 2 3       7 8 9
//        1 2           8 9
//        1               9
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i= 1;i<=n*2-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1;i<n;i++) {

            for (int j = 1; j<n-i+1;j++) {
                System.out.print(j+ " ");
            }
            for (int j = 1;j<=i*2-1;j++) {
                System.out.print(" " + " ");
            }
            for(int j=n+i;j<=n*2-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void testpattern() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1;i<=n;i++) {
            int j;
            for (j = 1; j <i;j++) {
                System.out.print(" " + " ");
            }
            for (j = 1;j<=n-i+1;j++) {
                System.out.print(j + " ");
            }
            for(int k=n-i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    private static void starBridge() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

    }

    private static void patterns3() {

        //        1
//              1 2 3
//            1 2 3 4 5
//          1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8 9


            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (k = 1; k <= i - 1; k++) {
                    System.out.print(k + " ");
                }
                for(int j=i-2;j>=1;j--){
                    System.out.print(j+ " ");
                }
                System.out.println();

            }
    }

    private static void patterns2() {
        //        1
//              1 2 3
//            1 2 3 4 5
//          1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8 9


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }

    private static void nstnsp() {
//                1
//              1 2 3
//            1 2 3 4 5
//          1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8 9


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nst=1;
        int nsp= n-1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=nsp;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print(k+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

    }

    private static void patterns1() {
//                1
//              1 2
//            1 2 3
//          1 2 3 4
//        1 2 3 4 5

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }


    }
}
