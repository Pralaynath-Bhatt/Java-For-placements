package DSA.LinkedList;
import java.util.Scanner;
public class IntersectionOfTwoLL {
    static void main() {
        {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int k =sc.nextInt();
            Node headA =new Node(sc.nextInt());
            Node temp = headA;
            for (int i = 1; i < n; i++) {
                temp.next=new Node(sc.nextInt());
                temp=temp.next;
            }
            Node headB =new Node(sc.nextInt());
            temp = headB;
            for (int i = 1; i < k; i++) {
                temp.next=new Node(sc.nextInt());
                temp=temp.next;
            }
            if(n>k){
                int j=n-k;
                while(j!=0){
                    headA=headA.next;
                    j--;
                }
            }else{
                int j =k-n;
                while(j!=0){
                    headB=headB.next;
                    j--;
                }
            }
            while(headA.value!=headB.value){
                if(headA==null){
                    System.out.println("null");
                    return;
                }
                headA=headA.next;
                headB=headB.next;
            }
            if(headA!=null)System.out.println(headA.value);
        }
    }
}
