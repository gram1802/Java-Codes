package Trees;
import java.util.*;;

class Node {
    int data;
    Node left,right;

    public Node(int d){
        data =d;
        left=right=null;
    }
}

public class ZigZagBinaryTree {

    Node root;

    public List<List<Integer>> spiral(Node root){

        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        int level = 0;
        
        while(!queue.isEmpty()){
            levels.add(new ArrayList<>());
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node node = queue.remove();

                if(level%2 == 0){

                    levels.get(level).add(node.data);

                }

                else {

                    levels.get(level).add(0,node.data);

                }

                
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            level++;

        }

        return levels;
    }

    public static void main(String[] args) {
        ZigZagBinaryTree tree = new ZigZagBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right = new Node(6);

        System.out.println(tree.spiral(tree.root));

    }
    
}
