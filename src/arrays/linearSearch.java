package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the element to  search");
        int x = scanner.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[size];
        int found =-1;
        for (int i = 0; i<size;i++)
            arr[i]= scanner.nextInt();
        for(int i =0;i<size;i++){
            if(arr[i]==x){
                found = i;
            }
        }
        if(found!=-1){
            System.out.println("Element "+x+" found at index: "+found);
        }
        else System.out.println("Element not found");
    }
}
