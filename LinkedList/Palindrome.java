package LinkedList;

public class Palindrome {

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

    public Node middle(){

        Node fast = head;
        Node slow=head;

        while(slow != null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast!=null){
            slow = slow.next;
        }


        return slow;
    }

    public boolean reverse(){

        Node mid = middle();

        Node bfmid = head;
        while(bfmid.next != mid){
            bfmid = bfmid.next;
        }
        
        Node next = null;
        Node prev = null;

        
        while(mid!=null){
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }

        bfmid.next = prev;

        Node newMid = middle();
        Node start = head;

        while(newMid != null){
            if(start.data != newMid.data){
                return false;
            }
            start = start.next;
            newMid = newMid.next;
        }

        return true;

    }

    public static void main(String[] args) {
        
        Palindrome obj = new Palindrome();

        obj.create(1);
        obj.create(2);
        obj.create(1);
      

        obj.printAll();
        System.out.println();

        System.out.println(obj.reverse());

    }
    
}
