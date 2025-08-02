package DSA.arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l=n-1;
        int temp;
        int i=0;
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        i=0;
        while(i<l){
            temp=arr[i];
            arr[i]= arr[l];
            arr[l]= temp;
            i++;
            l--;
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }
}
