package DSA.LinkedList;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CycleInLL {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i=1;i<n;i++){
            temp.next = new Node(sc.nextInt());
            temp=temp.next;
        }
        int posi=sc.nextInt();
        if(posi!=-1){
            Node cycle =head;
            for(int i =0;i<posi;i++){
                cycle=cycle.next;
            }
            temp.next=cycle;
        }
        else{
            System.out.println("null");
        }
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow==fast){
            temp=head;
            while(temp!=slow){
                slow=slow.next;
                temp=temp.next;
            }
            System.out.println(slow.value);
        }
    }
}
