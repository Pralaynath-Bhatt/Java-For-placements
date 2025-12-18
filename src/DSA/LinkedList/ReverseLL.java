package DSA.LinkedList;
import java.util.*;

public class ReverseLL {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        if(head==null||head.next==null){
            System.out.println(head.value);
            return;
        }
        Node prev=null,current=head,next=head.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next==null)
                break;
            next=next.next;
        }
        while(prev!=null){
            System.out.print(prev.value+" ");
            prev=prev.next;
        }
    }
}

