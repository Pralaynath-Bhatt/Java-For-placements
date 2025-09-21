package DSA.LinkedList;
class sll{
    Node head;
    Node tail;
    int size;

    public sll() {
    }
    public void size(){
        System.out.println(size);
    }
    public void insert(int posi,int val) throws Exception{
        Node in=new Node(val);
        if(posi==0){
            insertStart(in);
        }
        else if(posi==size){
            insertEnd(in);
        }
        else if(posi>size){
            throw new Exception("Index is higher then the size try a lower index");
        }
        else{
            Node temp= head;
            for(int i=0;i<posi-1;i++){
                temp=temp.next;
            }
            in.next=temp.next;
            temp.next=in;
            size++;
        }
    }

    public void insertEnd(Node a) {
        if(head==null){
            head=a;
            tail=a;
        }
        else{
            tail.next=a;
            tail=tail.next;
        }
        size++;
    }
    public void insertStart(Node a) {
        if(head==null){
            head=a;
            tail=a;
        }
        else{
            Node temp = a;
            temp.next=head;
            head=temp;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void getElement(int i) throws Exception {
        if(i==0){
            System.out.println(head.value);
        }
        else if(i==size-1) System.out.println(tail.value);
        else if(i<0||i>=size) throw new Exception("Bhaii Masti kyu?");
        else{
            Node temp= head;
            for (int j = 0; j < i; j++) {
                temp=temp.next;
            }
            System.out.println(temp.value);
        }
    }

    public void delete(int i) throws Exception {
        if(i==0){
            deleteHead();
        }
        else if(i<0||i>=size) throw new Exception("Bhai!! error");
        else {
            Node temp= head;
            for (int j = 0; j < i-1; j++) {
                temp=temp.next;
            }
            if(temp.next==tail) temp.next=null;
            else temp.next=temp.next.next;
            size--;
        }
    }

    private void deleteHead() {
        head=head.next;
        size--;
    }
}
public class singlyLL  {
    public static void main(String[] args) throws Exception {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        sll ll=new sll();
//        ll.insertEnd(a);
//        ll.display();
//        ll.insertEnd(b);
//        ll.insertEnd(c);
//        ll.display();
//        ll.insertEnd(d);
//        ll.display();
//        ll.insertStart(a);
//        ll.insertEnd(b);
//        ll.insertStart(c);
//        ll.insertStart(d);
//        ll.size();
//        ll.display();

        ll.insertStart(a);
        ll.insertEnd(b);
        ll.insertEnd(c);
        ll.insertEnd(d);

        ll.size();
        ll.display();
//        ll.getElement(0);
        ll.delete(-1);
        ll.size();
        ll.display();
    }
}
