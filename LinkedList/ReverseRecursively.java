package LinkedList;

public class ReverseRecursively {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void create(int data){

        if(head==null){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        
    }

    public void ReverseRecur(Node cur, Node prev){

        if(cur.next==null){
            head = cur;
            cur.next=prev;
            return;
        }

        Node next = cur.next;
        cur.next = prev;
        ReverseRecur(next, cur);
       
    }

    public void printAll(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data + " ");
            t=t.next;
        }
    }

    public static void main(String[] args) {
        
        ReverseRecursively obj = new ReverseRecursively();

        obj.create(1);
        obj.create(2);
        obj.create(3);
        obj.create(4);

        obj.printAll();

        System.out.println();

        obj.ReverseRecur(obj.head,null);

        obj.printAll();
    }
   
}
