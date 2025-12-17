package DSA.LinkedList;
import java.util.Scanner;
public class PartitionLL {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i =1;i<n;i++){
            temp.next = new Node(sc.nextInt());
            temp=temp.next;
        }
        int part = sc.nextInt();
        Node dummyA=new Node(-1);
        Node dummyB= new Node(-1);
        Node tempA=dummyA;
        Node tempB=dummyB;
        temp=head;
        while(temp!=null){
            if(temp.value<part){
                tempA.next=temp;
                temp=temp.next;
                tempA=tempA.next;
            }
            else{
                tempB.next=temp;
                temp=temp.next;
                tempB=tempB.next;
            }
        }
        tempA.next=dummyB.next;
        tempB.next=null;
        temp = dummyA.next;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
