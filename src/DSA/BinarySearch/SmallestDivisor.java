package DSA.BinarySearch;

import java.util.Scanner;

public class SmallestDivisor {
    //leetcode 1283
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t= sc.nextInt();
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(arr[i],mx);
        }
        int d=-1;
        int lo=1,hi=mx;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0){
                    sum+=arr[i]/mid;
                }else{
                    sum+=arr[i]/mid+1;
                }
            }
            if(sum<=t){
                hi=mid-1;
                d=mid;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(d);
    }
}
