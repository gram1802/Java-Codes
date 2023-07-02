package Trees;
import java.util.*;

class Node {
    int data;
    Node left,right;

    public Node(int d){
        data =d;
        left=right=null;
    }
}



public class CompleteBinaryTreeOrNot {

    Node root;

    public boolean completeOrNot(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean flag = false;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node node = queue.remove();

                if(node == null){
                    flag = true;
                    continue;
                }

                if(flag && node != null){
                    return false;
                }

                queue.add(node.left);
                queue.add(node.right);

            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        CompleteBinaryTreeOrNot tree = new CompleteBinaryTreeOrNot();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right = new Node(6);

        System.out.println(tree.completeOrNot(tree.root));
    }
    
}
