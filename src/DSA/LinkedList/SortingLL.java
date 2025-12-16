package DSA.LinkedList;

import java.util.Scanner;

public class SortingLL {
    public static Node partition(Node head){
        Node slow=head;
        Node fast=head;
        if(head==null||head.next==null) return head ;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow;
        slow=slow.next;
        temp.next=null;
        Node a = partition(head);
        Node b =partition(slow);
        Node merged = merge(a,b);
        return merged;
    }

    public static Node merge(Node a, Node b) {
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(a!=null&&b!=null){
            if(a.value< b.value){
                temp.next= a;
                a=a.next;
            }
            else{
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }
        if(a!=null){
            temp.next=a;
        }
        if(b!=null){
            temp.next=b;
        }

        return dummy.next;
    }

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
        if(head.next==null){
            System.out.println(head.value);
            return;
        }
        Node merged = partition(head);
        while(merged!=null){
            System.out.print(merged.value+" ");
            merged=merged.next;
        }//adding for test
    }
}
