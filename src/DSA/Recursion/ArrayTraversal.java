package DSA.Recursion;

import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int a=0;
        print(arr,a,n);
    }
    public static void print(int[] arr,int a, int n){
        if(a>=n) return;
        System.out.print(arr[a]);
        print(arr,a+1,n);
    }
}
