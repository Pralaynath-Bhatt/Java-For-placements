package DSA.strings;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaration
        String str = " Hii my name is Pranjal Bhatt";
        System.out.println(str);
//input
        //takes input of whole line
        String str3 =sc.nextLine();
        System.out.println(str3);


        String str2 = sc.next();//only takes first element as input after space the function ends
        System.out.println(str2);

        //charAt() function
        System.out.println(str.charAt(3));

        //length() function
        System.out.println(str.length());


    }
}
