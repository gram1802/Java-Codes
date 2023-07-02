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

public class ReverseLevelOrderTraversal {

    Node root;

    public List<List<Integer>> levelOrderBottom(Node root) {

        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();

        if (root == null){
            return levels;
        }

        queue.add(root);
        int level = 0;
        
        while(!queue.isEmpty()){
            levels.add(new ArrayList<>());
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node node = queue.remove();
                levels.get(level).add(node.data);

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            level++;

        }

         Collections.reverse(levels);

         return levels;
    }

    public static void main(String[] args) {
        ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right = new Node(6);

        System.out.println(tree.levelOrderBottom(tree.root));
    }
    
}
