package arrays;
import java.util.Scanner;

public class tp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int toFind = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == toFind) {
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}