package Loops;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ApUsingMaths {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n= sc.nextInt();
            for(int i=1;i<=2*n-1;i+=2){
                System.out.println(i);
            }
        }
    }


