package DSA.AdvancedSorting;

/* package whatever; // don't place package name! */
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckDublicate
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
        while(true){
            if(arr[0]==arr[arr[0]]) {
                System.out.print(arr[0]);
                return;
            }
            swap(arr,0,arr[i]);
        }
    }
}
