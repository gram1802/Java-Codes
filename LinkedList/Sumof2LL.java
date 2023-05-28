package LinkedList;

public class Sumof2LL {

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

    public void add(Node l1, Node l2){

        Sumof2LL ans = new Sumof2LL();

        int val1,val2;
        int sum=0,carry=0;

        while(l1!=null || l2!=null){

            val1 = (l1==null) ? 0 : l1.data;
            val2 = (l2==null) ? 0 : l2.data;

            sum = val1+val2+carry;

            if(sum>=10){
                carry=1;
                ans.create(sum%10);

            }
            else{
                carry=0;
                ans.create(sum);
            }

            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry==1)
            ans.create(1);
        
        ans.printAll();

    }

    public static void main(String[] args) {
        
        Sumof2LL obj1 = new Sumof2LL();

        Sumof2LL obj2 = new Sumof2LL();

        obj1.create(9);
        obj1.create(9);
        obj1.create(9);
        obj1.create(9);

        obj1.printAll();
        System.out.println();

        obj2.create(9);
        obj2.create(9);
        obj2.create(9);
        obj2.create(9);
        obj2.create(9);
        obj2.create(9);
        obj2.create(9);

        obj2.printAll();
        System.out.println();

        obj2.add(obj1.head, obj2.head);

    }
    
}
