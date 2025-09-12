package DSA.Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    private static void pip(int i) {
        if(i==0) return;
        System.out.println(i);
        pip(i-1);
        System.out.println(i);
        pip(i-1);
        System.out.println(i);
    }
}
