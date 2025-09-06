package DSA.BinarySearch;

import java.lang.reflect.AccessFlag;
import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= {2,22,55,77,99,102,133};
        int n=arr.length;
        int target=sc.nextInt();
        int low=0,high=n-1,mid,index=-1;
        boolean flag = false;
        while(low<=high){
            mid=(high-low)/2+low;
            if(target==arr[mid]){
                flag=true;
                index=mid;
                break;
            }
            if(target<arr[mid]){
                high=mid-1;
            }
            if(target>arr[mid]){
                low=mid+1;
            }


        }
        System.out.println(flag);
        System.out.println(index);

    }
}
