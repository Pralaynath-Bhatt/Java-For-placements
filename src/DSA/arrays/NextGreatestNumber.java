package DSA.arrays;

import java.util.Scanner;

public class NextGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int mx = arr[n-1];
        for(int i=n-2;i>=0;i--){
            mx=Math.max(mx,arr[i]);
            arr[i]= mx;
        }
        for(int elm: arr){
            System.out.print(elm+ " ");
        }

    }
}
