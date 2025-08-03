package DSA.D2Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int[][] brr ={{1,2,3},{4,5,6},{7,8,9}} ;

        //Input
        for(int i =0 ; i<2;i++){
            for(int j =0 ; j<3;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        //OUTPUT
        for(int i =0 ; i<2;i++){
            for(int j =0 ; j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        //for each loop
        System.out.println("In for Each loop");
        for(int[] elm:brr){
            for(int x:elm){
                System.out.print(x+ " ");
            }
            System.out.println();
        }

        //no of rows
        int m = arr.length;
        System.out.println("Number of rows: "+m);
        //no of columns
        int n = arr[1].length;
        System.out.println("Number of columns: "+n);
    }
}
