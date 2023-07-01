package Trees;

import javax.naming.directory.SearchControls;

class Node{
    int data;
    Node left,right;

    public Node(int d){
        data=d;
        left=right=null;
    }
}

public class BST_Operations {

    Node root;

    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    Node insertion(Node root, int data){

        if(root==null){
            return new Node(data);
        }
        if(root.data > data){
            root.left = insertion(root.left, data);
        }
        else{
            root.right = insertion(root.right, data);
        }
        return root;
    }

    Node Search(Node root,int data){

        if(root==null || root.data == data){
            return root;
        }
        
        if(root.data > data){
            Node l = Search(root.left, data);
            return l;
        }
        else{
            Node r = Search(root.right,data);
            return r;
        }
        
    }

    Node Deletion(Node root,int data){

       if(root.data > data){
            root.left = Deletion(root.left, data);
       }
       else if(root.data < data){
            root.right = Deletion(root.right,data);
       }
       else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node inorderSucc = FindMinVal(root.right);
                root.data = inorderSucc.data;
                root.right = Deletion(root.right, inorderSucc.data);
            }
       }
       return root;
        
    }

    Node FindMinVal(Node root){
        Node cur = root;
        while(cur.left != null){
            cur=cur.left;
        }
        return cur;
    }

    public static void main(String[] args) {
        
        BST_Operations tree = new BST_Operations();
        tree.root = new Node(45);
        tree.root.left = new Node(15);
        tree.root.left.left = new Node(10);
        tree.root.left.left.right = new Node(12);
        tree.root.left.right = new Node(20);
        tree.root.right = new Node(79);
        tree.root.right.left = new Node(55);
        tree.root.right.right = new Node(90);
        System.out.println("Before Insertion");
        tree.inorder(tree.root);
        System.out.println();

        // INSERTION

        System.out.println();
        System.out.println("After Insertion");
        tree.insertion(tree.root, 34);
        tree.inorder(tree.root);
        System.out.println();

        //SEARCHING
        
        if (tree.Search(tree.root, 90) != null){
            System.out.println("ELement is present in BST");
        }
        else{
            System.out.println("Element is not present in BST");
        }

        // DELETION

        tree.Deletion(tree.root, 15);
        tree.inorder(tree.root);
        







    }
    
}
