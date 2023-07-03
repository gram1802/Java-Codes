package Trees;
import java.util.*;

class Node {

    int data;
    Node left,right;

    public Node(int d){
        data = d;
        left = right = null;
    }
}


public class BinaryTreeLeftView {

    Node root;

    public List<Integer> leftView(Node root){

        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(root);

        boolean flag = false;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                Node node = queue.remove();

                if(node != null && flag == false){
                    list.add(node.data);
                    flag = true;
                }

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                } 
            }
            flag = false;
        }

        return list;
    }

    public static void main(String[] args) {
        
        BinaryTreeLeftView tree = new BinaryTreeLeftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.leftView(tree.root));
    }

    


    
}