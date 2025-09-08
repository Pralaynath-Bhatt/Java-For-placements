package DSA.BinarySearch;

import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag =false;
        if(x<=1) {System.out.println(x);flag=true;};
        int low=0;
        int high=x;
        while(low<=high){
            int mid = (high-low)/2+low;
            if(mid==x/mid){System.out.println(mid);flag=true;}
            else if(mid>=x/mid) high=mid-1;
            else low= mid+1;
        }
        if(!flag)
            System.out.println(high);
    }
}
