package tree;
/** Symmetric tree
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }else{
            if(isSymmetric(root.left, root.right))
                return true;
            else
                return false;
        }
    }
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left==null){
            if(right!=null)
                return false;
            else
                return true;
        }else{
            if(right==null)
                return false;
        }
        if(left.val!=right.val)
            return false;
        if(isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left))
            return true;
        else
            return false;
    }
}