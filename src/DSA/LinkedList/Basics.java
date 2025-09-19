package DSA.LinkedList;

import org.w3c.dom.ls.LSOutput;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
public class Basics {
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(10);
        Node c =new Node(15);
        Node d =new Node(20);
        Node e =new Node(25);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a);
    }

}
