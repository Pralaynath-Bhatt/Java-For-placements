package DSA.BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= {2,22,22,55,77,99,99,99,102,133};
        int n=arr.length;
        int target=sc.nextInt();
        int low=0,high=n-1,mid,upperBound =-1;
        while(low<=high){
            mid=(high-low)/2+low;
            if(target>=arr[mid]){
                low=mid+1;
                upperBound = Math.max(mid,upperBound);
            }
            if(target<arr[mid]){
                high=mid-1;
            }


        }
        System.out.println(upperBound);

    }
}
