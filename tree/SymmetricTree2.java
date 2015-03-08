package tree;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree2 {
    public boolean isSymmetric(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        int n;
        while((n=nodes.size())>0){
            for(int i=0; i<n/2; i++){
                TreeNode left=nodes.get(i);
                TreeNode right=nodes.get(n-1-i);
                if(left==null){
                    if(right!=null)
                        return false;
                }else{
                    if(right==null){
                        return false;
                    }else{
                        if(left.val!=right.val)
                            return false;
                    }
                }
            }
            for(int i=0; i<n; i++){
                TreeNode head=nodes.get(0);
                if(head!=null){
                	nodes.add(head.left);
                	nodes.add(head.right);
                }
                nodes.remove(0);
            }
        }
        return true;    
    }
}
