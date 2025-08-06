package DSA.D2Array;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6}};
        int n = arr.length;
        int k = arr[0].length;
        int[][] t=new int[k][n];
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++) {
                t[i][j]=arr[j][i];
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
