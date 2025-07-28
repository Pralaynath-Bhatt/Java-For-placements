package Basic.patterns;

import java.util.Scanner;

public class specialPatterns {
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4() //unimplemented;
        //pattern5();
        //pattern6();
        //pattern7();
        pattern8();
    }

    private static void pattern8() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j<=n-i)
                    System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void pattern7() {
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        0 1 0 1 0 1

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            for(int i =1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    if((i+j)%2==0 )
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }

                System.out.println();
            }

    }

    private static void pattern6() {
        //*    *
        // *  *
        //  *
        // * *
        //*   *
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            for(int i =1;i<=n;i++){
                for(int j =1;j<=n;j++){
                    if(i==j || i+j==n+1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                System.out.println();
            }


    }

    private static void pattern5() {
        //star
        //  *
        //  *
        //*****
        //  *
        //  *
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2 !=0){
            for(int i =1;i<=n;i++){
                for(int j =1;j<=n;j++){
                    if(i==n/2+1 || j == n/2+1)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                System.out.println();
            }
        }

    }

    private static void pattern4() {
        //7 8 9 10  n=4
        //4 5 6
        //2 3
        //1

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = n;
        int k;
        for(int i = 1;i <= n;i++,p--){
            k=(p-1)*2+1;
            for (int j = 1;j<=p;j++,k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        //0
        //2 2
        //4 4 4
        //6 6 6 6
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        for(int i = 1;i <= n;i++,k+=2){
            for (int j = 1;j<=i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    private static void pattern2() {
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=1;
        for(int i = 1;i <= n;i++){
            for (int j = 1;j<=i;j++,k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    private static void pattern1() {
        //1
        //1 3
        //1 3 5
        //1 3 5 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for(int i =1; i<=n;i++){
            for(int j =1,k=0; j<=i;j++,k++){
                System.out.print(j+k+" ");
            }
            System.out.println();
        }

    }
}
