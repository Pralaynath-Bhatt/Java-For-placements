package DSA.Recursion;

import java.util.Scanner;

public class PowAB {
    public static int pow(int a, int b)
    {
//        if(b==1)return a;
        if(b==0) return 1;
        else return a*pow(a,b-1);
    }
    public static int pow2(int a, int b)    //logn complexity
    {
        int ans=-1;
        if(b==0) return 1;
        else if(b%2==0) {
            ans = pow2(a,b/2);
            return ans*ans;
        }
        else { ans = pow2(a,b/2);
        return ans*ans*a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        int ans=pow2(a,b);
        System.out.println(ans);
    }
}
