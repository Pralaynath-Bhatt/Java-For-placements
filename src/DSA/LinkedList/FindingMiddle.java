package DSA.LinkedList;

import java.util.Scanner;

public class FindingMiddle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Node head =new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        Node slow =head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        if(fast.next!=null) slow= slow.next;
        System.out.println(slow.value);
    }
}
