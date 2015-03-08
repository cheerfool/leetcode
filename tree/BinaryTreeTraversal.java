package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
    public List<ArrayList<Integer>> levelOrder(TreeNode root) {
        List<ArrayList<Integer>> orders= new ArrayList<ArrayList<Integer>>();
        List<TreeNode> nodes= new ArrayList<TreeNode>();
        if(root==null)
            return orders;
        else
            nodes.add(root);
        int n;
        while((n=nodes.size())>0){
            ArrayList<Integer> level= new ArrayList<Integer>();
            for(TreeNode node: nodes){
                if(node!=null)
                    level.add(node.val);
            }
            for(int i=0; i<n; i++){
                TreeNode head= nodes.get(0);
                if(head.left!=null)
                    nodes.add(head.left);
                if(head.right!=null)
                    nodes.add(head.right);
                nodes.remove(0);
            }
            if(level.size()>0)
                orders.add(level);
        }
        return orders;
    }
}
