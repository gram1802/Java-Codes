package LinkedList;
import java.util.*;

public class InsertWithPointerToNode {
    
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void create(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print(Node cur){
       
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public void insert(int n, int value){

        Node temp = head;

        Node newData = new Node(value);

        while(n>1){
            temp = temp.next;
            n--;
        }

        if(n==0){

            newData.next = head;
            head = newData;
            return;
        
        }

        newData.next = temp.next;
        temp.next = newData;


    }

    public static void main(String[] args) {

        InsertWithPointerToNode obj = new InsertWithPointerToNode();
        Scanner sc = new Scanner(System.in);

        obj.create(1);
        obj.create(2);
        obj.create(4);
        obj.create(5);
        obj.create(6);

        obj.print(obj.head);
        System.out.println();

        System.out.println("Enter pointer to node after which element should be added : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of the node : ");
        int val = sc.nextInt();


        obj.insert(n, val);

        obj.print(obj.head);

        
    }
}
