package DSA.Recursion;

import java.util.Scanner;

public class print1toN {
    public static void printn(int n,int i){
        if(n<i)return;
        else {
            System.out.println(i);
            printn(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printn(n,1);
    }
}
