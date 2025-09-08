package DSA.BinarySearch;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RotatedSortedPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int lo=0,hi=n-1,output=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target) {
                output=mid;
                break;
            }
            else if(arr[mid]<=arr[hi]){
                if(arr[mid]<target&&arr[hi]<=target){
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            else{
                if(target>=arr[lo]&&target<arr[mid]){
                    hi=mid-1;
                }
                else lo=mid+1;
            }
        }
        System.out.println(output);
    }
}
