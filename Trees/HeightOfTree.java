package Trees;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left, right;

  
    public TreeNode(int d){
        data=d;
        left=right=null;
    }
}

public class HeightOfTree {

    TreeNode root;

    public static int height(TreeNode root){
        if(root==null)
            return 0;
        int lDepth = height(root.left);
        int rDepth = height(root.right);

        return 1 + Math.max(lDepth, rDepth);
        
    }

    public static void main(String[] args) {
        HeightOfTree tree = new HeightOfTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);

        System.out.println(tree.height(tree.root));
        

    }
    
}
