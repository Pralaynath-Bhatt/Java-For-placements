package DSA.Recursion;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permu("",str);
    }

    private static void permu(String s, String str) {
        if(str.length()==0){
            System.out.println(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String left =str.substring(0,i);
            String right =str.substring(i+1);
            char s1=str.charAt(i);
            permu(s+s1,left+right);
        }
    }
}
