package Trees;
import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int d){
        data=d;
        left=right=null;
    }
}

public class DiameterOfBinaryTree {

    public int findDiameter(Node root, int[] diameter){

        if(root==null)
            return 0;
        
        int lDepth = findDiameter(root.left,diameter);
        int rDepth = findDiameter(root.right,diameter);

        diameter[0] = Math.max(diameter[0],lDepth+rDepth);

        return 1 + Math.max(lDepth, rDepth);


    }
}
    

