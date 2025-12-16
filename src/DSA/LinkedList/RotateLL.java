package DSA.LinkedList;

import java.util.Scanner;

public class RotateLL {
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
        int k = sc.nextInt();
        k%=n;
        Node slow=head,fast=head;
        while(k!=0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node newHead=slow.next;
        slow.next=null;
        fast.next=head;
        temp=newHead;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
