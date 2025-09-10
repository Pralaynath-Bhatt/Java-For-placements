package DSA.BinarySearch;

import java.util.Scanner;

public class Leetcode2064 {
        public static boolean isPossible(int[] arr,int mid,int n){
            int stores=0;
            for(int elm:arr){
                if(elm%mid==0){
                    stores+=elm/mid;
                }
                else
                    stores+=elm/mid+1;
            }
            if(stores<=n) return true;
            return false;
        }
        public static int minimizedMaximum(int n, int[] arr) {
            int mx = Integer.MIN_VALUE;
            for(int elm:arr){
                mx=Math.max(mx,elm);
            }
            int hi=mx,lo=1,val=-1;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(isPossible(arr,mid,n)){
                    hi=mid-1;
                    val = mid;
                }
                else{
                    lo=mid+1;
                }
            }
            return val;
        }
        public static void main(String[] args) {
            //Write your code here
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int m =sc.nextInt();
            int[] arr=new int[m];
            for(int i =0;i<m;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(minimizedMaximum(n, arr));
        }
    }