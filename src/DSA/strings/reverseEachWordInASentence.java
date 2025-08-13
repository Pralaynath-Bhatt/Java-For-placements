package DSA.strings;

import java.util.Scanner;

public class reverseEachWordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder(sc.nextLine());
        reverseEachWord(sb);
        System.out.println(sb);
    }

    private static void reverseEachWord(StringBuilder sb) {
        int i =0,j=0;
        while(j<sb.length()-1){
            while(sb.charAt(j)!=' '&&j<sb.length()-1){
                j++;
            }
            swapChar(sb,i,j-1);
            j++;
            i=j;
        }
        swapChar(sb,i,j-1);
    }

    private static void swapChar(StringBuilder sb, int i, int j) {
        while(i<j){
            char temp= sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
