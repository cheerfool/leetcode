package tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null){
            if(root.right==null)
                return 1;
            else
                return maxDepth(root.right)+1;
        }else{
            if(root.right==null)
                return maxDepth(root.left)+1;
            else
                return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
