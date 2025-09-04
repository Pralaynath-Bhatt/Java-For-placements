package DSA.Sort;

import java.util.Scanner;

public class q1 {
    //question given a array assign its rank lowest as 0 highest as n
    public static void main(String[] args) {
        int[] arr=giveArr();
        int n=arr.length;
        System.out.println("Numbers");
        print(arr);
        int index=0;
        for (int i = 0; i < n; i++) {
            int smoll = Integer.MAX_VALUE;
            int smallest=-1;
            for (int j = 0; j < n; j++) {
                if(arr[j]<smoll&&arr[j]>index){
                    smoll=arr[j];
                    smallest= j;
                }
            }
            if(smallest!=-1){
                arr[smallest] = index;
            index++;}
        }
        System.out.println();
        System.out.println("Ranks");
        print(arr);
    }

    public static int[] giveArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    private static void print(int[] arr) {
        for(int elm: arr){
            System.out.print(elm+" ");
        }
    }
}
