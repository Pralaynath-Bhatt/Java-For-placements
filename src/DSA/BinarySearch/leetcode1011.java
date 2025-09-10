package DSA.BinarySearch;

import java.util.Scanner;

public class leetcode1011 {
    public static boolean undercap(int mid, int[] arr,int days){
        int sum=0;
        int d=1;
        for(int elm:arr){
            if(elm>mid) return false;
            if((sum+=elm)<=mid){

            }
            else{
                sum=0;
                sum+=elm;
                d++;
            }
        }
        if(d<=days){
            return true;
        }
        return false;
    }
    public static int shipWithinDays(int[] arr, int days) {
        int cap=0,mid=0;
        for(int elm:arr){
            cap+=elm;
        }
        int lo=0,hi=cap;
        while(lo<=hi){
            if((hi-lo)%2==0)
                mid= lo+(hi-lo)/2;
            else mid= lo+1+(hi-lo)/2;
            if(undercap(mid,arr,days)==true){
                cap=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return cap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int days= sc.nextInt();
        System.out.println(shipWithinDays(arr,days));
    }
}
