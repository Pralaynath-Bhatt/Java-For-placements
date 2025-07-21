package Loops;
import java.util.Scanner;

public class TableOfN {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            for(int i =n;i<=n*10;i+=n){
                System.out.println(i);
            }
        }
    }
