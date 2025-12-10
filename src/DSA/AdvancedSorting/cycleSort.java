package DSA.AdvancedSorting;


import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cycleSort
{
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int i=0;
        while(i<n){
            if(arr[i]!=i+1) swap(arr,i,arr[i]-1);
            else i++;
        }
        System.out.println();
        for(int elm:arr){
            System.out.print(elm+" ");
        }
    }
}
