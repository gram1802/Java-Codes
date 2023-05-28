package LinkedList;

class ReverseIteratively {

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

    public void reverseIte(){

        Node curr=head;
        Node prev = null;
        Node next = null;

        while(curr!=null){

            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }

        head = prev;


    }


    public void printAll(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data + " ");
            t=t.next;
        }
    }


    public static void main(String[] args) {
        
        System.out.println("Create a linked List : ");

        ReverseIteratively obj = new ReverseIteratively();
        obj.create(1);
        obj.create(2);
        obj.create(3);
        obj.create(4);

        obj.printAll();

        System.out.println();

        obj.reverseIte();

        obj.printAll();

    }


    
}