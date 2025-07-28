package Basic.Conditionals;

import java.util.Scanner;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sell Price: ");
        int SP = sc.nextInt();
        System.out.println("Enter Cost Price: ");
        int CP = sc.nextInt();
        if (SP > CP) System.out.print("Profit of "+ (SP-CP) );
        else if (CP > SP) System.out.print("Loss of "+ (CP-SP));
        if (SP == CP) System.out.print("No Profit, No Loss");
    }
}