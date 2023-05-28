package LinkedList;
import java.util.*;

class DeleteDuplicates {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next=null;
        }
    }

    public void create(int data){
        
        if(head == null){
            head = new Node(data);
            return;
        }
        Node new1 = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new1;
    }


    public void printAll(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }

    public void del(Node cur){

        while(cur != null && cur.next != null){
            if(cur.data == cur.next.data){
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
    }

    public static void main(String[] args) {
        
        DeleteDuplicates obj = new DeleteDuplicates();

        obj.create(13);
        obj.create(11);
        obj.create(13);
        obj.create(12);
        obj.create(1);

        obj.printAll();
        System.out.println();

        obj.del(obj.head);
        obj.printAll();




    }
}