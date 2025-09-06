package DSA.BinarySearch;

import java.util.Scanner;
public class FirstAndLast
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        int[] ans={-1,-1};
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=(high-low)/2+low;
            if(target==arr[mid]){
                if(arr[mid]==arr[mid-1]){
                    high=mid-1;
                }
                else {
                    ans[0] = mid;
                    break;
                }
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
        }
        low=0;high=n-1;
        while(low<=high){
            mid=(high-low)/2+low;
            if(target==arr[mid]){
                if(arr[mid]==arr[mid+1]){
                    low=mid+1;
                }
                else {
                    ans[1] = mid;
                    break;
                }
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
        }
        System.out.print(ans[0]);
        System.out.print(ans[1]);
    }
}