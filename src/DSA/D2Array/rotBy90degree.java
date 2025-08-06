package DSA.D2Array;

import java.util.Scanner;

public class rotBy90degree {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int[][] mat = new int[n][n];
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        mat[i][j]=sc.nextInt();
                    }
                }

                int temp;
                for(int i=0;i<n;i++){
                    for(int j=0;j<i;j++){
                        temp=mat[i][j];
                        mat[i][j]=mat[j][i];
                        mat[j][i]=temp;
                    }
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<n/2;j++){
                        temp=mat[i][j];
                        mat[i][j]=mat[i][n-1-j];
                        mat[i][n-1-j]=temp;
                    }
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }

            }
        }
