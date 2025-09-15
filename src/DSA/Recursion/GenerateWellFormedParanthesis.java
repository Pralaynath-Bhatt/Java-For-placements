package DSA.Recursion;

import java.util.Scanner;

public class GenerateWellFormedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        para("",n,0,0);
    }

    private static void para(String s, int n, int st, int end) {
        if (end==n){
            System.out.println(s);
        }
        else if(st==0){
            para(s+"(",n,st+1,end);
        }
        else if((end<st)){
            para(s+")",n,st,end+1);
            if(st<n){
                para(s+"(",n,st+1,end);
            }
        }
        else
            para(s+"(",n,st+1,end);
    }
}
