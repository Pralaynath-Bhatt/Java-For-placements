package DSA.strings;

public class indexOf {
    public static void main(String[] args) {
        String str = "The great coder Pranjal Bhatt is here";
        System.out.println("index of P: "+str.indexOf('P'));//present hai toh index nahi hai toh -1 aur P or p differect hai
        System.out.println("Last index of:"+str.lastIndexOf('a'));
        System.out.println("index of string"+str.indexOf("cod"));
    //compareTO(); this function is used to compare two strings lexogrphically(dictionary)
        //output is the difference in the ascii values of both strings first char
        //if first char is same the difference is calculated by the ascii difference in second value
        
    }
}
