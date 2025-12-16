package DSA.LinkedList;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RemovingDuplicatesFromSortedLL {
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
        if(head==null||head.next==null){
            System.out.println(head.value);
        }
        Node temp1=head.next;
        temp=head;
        while(temp1!=null){
            if(temp.value==temp1.value){
                temp.next=temp1.next;
                temp1=temp1.next;
            }
            else{
                temp=temp.next;
                temp1=temp1.next;
            }
        }
        temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}