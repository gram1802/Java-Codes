package Trees;

class Node{
    int data;
    Node left,right;

    public Node(int d){
        data=d;
        left=right=null;
    }
}

public class SymmetricTree {

    Node root;

    public boolean isMirror(Node t1,Node t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        return(t1.data == t2.data) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }

    public static void main(String[] args) {
        
        SymmetricTree tree = new SymmetricTree();

    }
    
}
