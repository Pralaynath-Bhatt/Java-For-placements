package DSA.Sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=giveArr();
        int n=arr.length;
        System.out.println("unsorted");
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int smoll = Integer.MAX_VALUE;
            int smallest=-1;
            for (int j = i; j < n; j++) {
                if(arr[j]<smoll){
                    smoll=arr[j];
                    smallest= j;
                }
                }
            if(smallest!=-1){
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest] = temp;}
        }
        System.out.println();
        System.out.println("Sorted");
        print(arr);
    }

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
        for(int elm: arr){
            System.out.print(elm+" ");
        }
    }
}
