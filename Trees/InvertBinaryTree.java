package Trees;

class Node{
    int data;
    Node left,right;

    public Node(int d){
        data = d;
        left=right=null;
    }
}

public class InvertBinaryTree {
    Node root;


    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public Node invert(Node root){

        if(root == null){
            return root;
        }

        invert(root.left);
        invert(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {

        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.preorder(tree.invert(tree.root));
    }
    
}
