package DSA.BinarySearch;

import java.util.Scanner;
public class FindKthMissing {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int lo=0,hi=n-1;
            while(lo<=hi){
                int mid= lo+(hi-lo)/2;
                int missed =arr[mid]-mid-1;
                if(missed<k) lo=mid+1;
                else hi=mid-1;
            }
            System.out.println(k+lo);
        }
}
