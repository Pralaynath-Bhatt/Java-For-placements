package DSA.strings;

import java.util.Scanner;

public class charSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char c =sb.charAt(i);
            int asci = (int)c;
            if((asci>=65)&&(asci<=90)){
                asci+=32;
            }
            else if((asci>=97)&&(asci<=122)){
                asci-=32;
            }
            c=(char)asci;
            sb.setCharAt(i,c);
        }
        System.out.println(sb);
    }
}
