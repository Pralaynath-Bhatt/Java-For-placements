package Basic.Basics;

public class ModulusOperatorRules {
    public static void main(String[] args) {
        System.out.println(10%3);
        System.out.println(10%-3);//sign of last variable does not matter= 1
        System.out.println(-10%3);//sign of first variable matters -(10%3)= -1
        System.out.println(-10%-3);//Sign of first variable matters so -(10%-3)= -1
    }
}
