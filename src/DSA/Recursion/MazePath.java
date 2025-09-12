package DSA.Recursion;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.println(path2(n,m));
    }

    private static int path2(int n, int m) {
        if(n==1||m==1) return 1;
        int down= path2(n-1,m);
        int right = path2(n,m-1);
        return down+right;
    }
}
