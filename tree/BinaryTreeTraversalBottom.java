package tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeTraversalBottom {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList ordersBottom= new ArrayList();
        ArrayList<TreeNode> nodes= new ArrayList<TreeNode>();
        if(root==null)
            return ordersBottom;
        else
            nodes.add(root);
        
        Stack orders= new Stack();
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
                orders.push(level);
        }
        while(!orders.isEmpty()){
            ordersBottom.add(orders.pop());
        }
        return ordersBottom;
    }
}
