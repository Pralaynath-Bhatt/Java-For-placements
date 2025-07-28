package DSA.arrays;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
     //basic();
     //rollNumberFinder();
    sumOfArray();
    }

    private static void sumOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] student=new int[size];
        int sum =0;
        for (int i=0; i<student.length; i++)
            student[i]= scanner.nextInt();
        for(int i=0; i<student.length; i++){
        sum += student[i];
        }
        System.out.println("the sum of array is: "+sum);

    }

    private static void rollNumberFinder() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] student=new int[size];
        for (int i=0; i<student.length; i++)
            student[i]= scanner.nextInt();
        for(int i=0; i<student.length; i++){
            if(student[i]<35)
                System.out.println(student[i]);
        }


    }


    private static void basic() {
        Scanner scanner =new Scanner(System.in);
        int[] arr = new int[5];//size = n-1 so arr[5] is index out of bound error
        arr[0]=100;//setting value
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
        //printing the values for loop
        System.out.println("printing the values for loop");
        for(int i =0; i<= arr.length-1;i++){
            System.out.println(arr[i]);
        }


        //printing the values for each loop
        System.out.println("printing the values for each loop");
        for(int val:arr){
            System.out.println(val);
        }


        //input via user on cmd  using for loop
        System.out.println("Enter data of each elements via for loop");
        for(int i =0; i<= arr.length-1;i++){
            arr[i]=scanner.nextInt();
        }

        //printing the values for each loop
        System.out.println("Again printing the values for each loop");
        for(int val:arr){
            System.out.println(val);
        }

        //variable size of array
        System.out.println("Enter the size of array u need: ");
        int size = scanner.nextInt();
        int[] arr2= new int[size];
        //input loop
        System.out.println("Enter the values: ");
        for(int i = 0 ; i<= arr2.length-1;i++)
            arr2[i]= scanner.nextInt();

        //output loop
        System.out.println("Output loop ");
        for (int val: arr2)
            System.out.println(val);

        //direct initialization
        System.out.println("arr3 initialized");
        int[] arr3 = {10,20,30,40,50};
        for(int val:arr3){
            System.out.println(val);
        }
    }
}
