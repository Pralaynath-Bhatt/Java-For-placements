package Basics;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                double principal= sc.nextDouble();
                double roi= sc.nextDouble();
                double time = sc.nextDouble();

                double simpleInterest = principal*roi*time/100;
                System.out.println(simpleInterest);

        }
}
