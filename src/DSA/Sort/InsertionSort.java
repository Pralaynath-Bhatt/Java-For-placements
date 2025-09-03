package DSA.Sort;

import java.util.Scanner;

public class InsertionSort {
    public static int[] giveArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    private static void print(int[] arr) {
        System.out.println();
        for(int elm: arr){
            System.out.print(elm+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        int n = arr.length;
        print(arr);
        int mindex;
        for (int i = 1; i < n; i++) {
            mindex=i;
            for(int j = i-1;j>=0; j--) {
                if(arr[mindex]<arr[j]){
                    int temp =arr[mindex];
                    arr[mindex]=arr[j];
                    arr[j]=temp;
                    mindex=j;
                }
                else break;
            }
        }
        print(arr);
    }
}
