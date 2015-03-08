package tree;

import java.util.HashMap;

public class BalancedBinaryTree {
    HashMap<TreeNode, Integer> hMap= new HashMap<TreeNode, Integer>();
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(!isBalanced(root.left)||!isBalanced(root.right))
            return false;
        return Math.abs(height(root.left)-height(root.right))<=1;
    }
    
    int height(TreeNode node){
        if(node==null)
            return 0;
        if(hMap.containsKey(node))
            return hMap.get(node);
        int h= Math.max(height(node.left), height(node.right))+1;
        hMap.put(node, h);
        return h;
    }
}
