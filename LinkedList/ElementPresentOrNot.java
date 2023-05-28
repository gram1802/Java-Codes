package LinkedList;
import java.util.*;

class ElementPresentOrNot{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
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

    public boolean check(Node cur, int n){
        
        while(cur!=null){
            if(cur.data == n){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public void printAll(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur=cur.next;
        }

    }

    public static void main(String[] args) {

        ElementPresentOrNot obj = new ElementPresentOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search");
        int n = sc.nextInt();

        obj.create(14);
        obj.create(21);
        obj.create(11);
        obj.create(30);
        obj.create(10);

        obj.printAll();

        System.out.println();

        System.out.println(obj.check(obj.head,n)); 




    }

    
}