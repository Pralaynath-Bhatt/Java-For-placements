package DSA.Recursion;

import java.util.Scanner;

public class CountAndSayy {
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1);
        String ans ="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                ans+=j-i;
                ans+=s.charAt(i);
                i=j;
            }
        }
        ans+=s.length()-i;
        ans+=s.charAt(i);
        return ans;
    }
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans=countAndSay(n);
        System.out.println(ans);
    }
}
