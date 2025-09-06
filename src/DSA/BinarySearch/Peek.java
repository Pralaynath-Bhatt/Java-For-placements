package DSA.BinarySearch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Peek {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int low=1,high=n-2,mid,output=-1;
            while(low<=high){
                mid=(high-low)/2+low;
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    output=mid;
                    break;
                }
                else if(arr[mid]>arr[mid-1]){
                    low=mid+1;
                }
                else if(arr[mid]>arr[mid+1]){
                    high=mid-1;
                }
            }
            System.out.println(output);

        }
    }
