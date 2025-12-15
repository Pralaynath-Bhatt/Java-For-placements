package DSA.LinkedList;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class RemoveNthLastElement {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Node head =new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        Node slow=head;
        Node fast=head;
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        if(fast==null) head=head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        while(head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
    }
}
