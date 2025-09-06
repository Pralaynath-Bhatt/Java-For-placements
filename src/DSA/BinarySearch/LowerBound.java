package DSA.BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr= {2,22,22,55,77,99,99,99,102,133};
    int n=arr.length;
    int target=sc.nextInt();
    int low=0,high=n-1,mid,index=-1,lowerBound =n;
    boolean flag = false;
    while(low<=high){
        mid=(high-low)/2+low;
        if(target<=arr[mid]){
            high=mid-1;
            lowerBound = mid;
        }
        if(target>arr[mid]){
            low=mid+1;
        }


    }
    System.out.println(flag);
    System.out.println(lowerBound);

}
}
