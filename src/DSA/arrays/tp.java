package DSA.arrays;

import java.util.Scanner;

public class tp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0,j=n-1;i<j;){
            if(arr[i]==0)   i++;
            if(arr[j]==1)   j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;j--;
            }
        }
        for(int elm: arr){
            System.out.print(elm+ " ");
        }



    }
}