package Conditionals;

import java.util.Scanner;

public class GreatestOf3Numbers {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int a = sc.nextInt();
            System.out.println("\nEnter Second Number: ");
            int b = sc.nextInt();
            System.out.println("\nEnter Third Number: ");
            int c = sc.nextInt();

            if(a>b){
                if(a>c){
                    System.out.println(a+ " is the Greatest");
                }
                else System.out.println(c+ " is the Greatest");
            }
            else{
                if(b>c){
                    System.out.println(b+ " is the Greatest");
                }
                else System.out.println(c+ " is the Greatest");
            }
        }
}


