package DSA.D2Array;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows and columns");
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int maxRow=n-1;
        int maxColumn=m-1;
        int minRow = 0;
        int minColumn =0;
        int k=1;
            while((minRow<=maxRow)&&(minColumn<=maxColumn)){
                for(int i=minRow,j=minColumn;j<=maxColumn;j++,k++){
                    arr[i][j]=k;
                }
                minRow++;
                for(int i=minRow,j=maxColumn;i<=maxRow;i++,k++){
                    arr[i][j]=k;
                }
                maxColumn--;
                for(int i=maxRow,j=maxColumn;j>=minColumn;j--,k++){
                    arr[i][j]=k;
                }
                maxRow--;
                for(int i=maxRow,j=minColumn;i>=minRow;i--,k++){
                    arr[i][j]=k;
                }
                minColumn++;

            }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
                }
            System.out.println();
            }
        }
}
class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int m = n;
        int maxRow=n-1;
        int maxColumn=m-1;
        int minRow = 0;
        int minColumn =0;
        int k =1;
        while((minRow<=maxRow)&&(minColumn<=maxColumn)){
            for(int i=minRow,j=minColumn;j<=maxColumn;j++,k++){
                arr[i][j]=k;
            }
            minRow++;
            if(minRow>maxRow || minColumn>maxColumn) break;
            for(int i=minRow,j=maxColumn;i<=maxRow;i++,k++){
                arr[i][j]=k;
            }
            maxColumn--;
            if(minRow>maxRow || minColumn>maxColumn) break;
            for(int i=maxRow,j=maxColumn;j>=minColumn;j--,k++){
                arr[i][j]=k;
            }
            maxRow--;
            if(minRow>maxRow || minColumn>maxColumn) break;
            for(int i=maxRow,j=minColumn;i>=minRow;i--,k++){
                arr[i][j]=k;
            }
            minColumn++;
        }
        return arr;
    }
}
