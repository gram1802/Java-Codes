package LinkedList;
import java.util.*;

class Insertion {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertEnd(int newData){

        Node newNode = new Node(newData);

        if(head==null){
            head = new Node(newData);
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null; //this is set when we call the constructor
    }

    public void insertBeg(int newData){

        Node newNode = new Node(newData);
        if(head==null){
            head = new Node(newData);
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void insertAft(int newData, Node prev){

        Node newNode = new Node(newData);
        newNode.next=prev.next;
        prev.next=newNode;

    }

    public void printAll(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data + " ");
            t=t.next;
        }
    }

    public static void main(String[] args) {
        
        Insertion obj = new Insertion();
        obj.insertBeg(-2);
        obj.insertEnd(1);
        obj.insertEnd(2);
        obj.insertEnd(3);
        obj.insertEnd(4);
        obj.insertEnd(5);
        obj.insertBeg(0);
        obj.insertBeg(-1);
        obj.printAll();

    }

}
