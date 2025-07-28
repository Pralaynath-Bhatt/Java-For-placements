package Loops;
import java.util.Scanner;

public class evenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for(int i=2;i<=j;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
