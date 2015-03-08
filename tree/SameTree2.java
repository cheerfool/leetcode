package tree;

import java.util.ArrayList;
import java.util.List;

public class SameTree2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> nodes1=new ArrayList<TreeNode>();
        List<TreeNode> nodes2=new ArrayList<TreeNode>();
        nodes1.add(p);
        nodes2.add(q);
        int n;
        while((n=nodes1.size())>0){
            for(int i=0; i<n; i++){
                TreeNode a=nodes1.get(i);
                TreeNode b=nodes2.get(i);
                if(a==null){
                    if(b==null)
                        continue;
                    else
                        return false;
                }else{
                    if(b==null)
                        return false;
                }
                if(a.val!=b.val)
                    return false;
            }
            for(int i=0; i<n; i++){
                TreeNode head1= nodes1.get(0);
                if(head1!=null){
                    nodes1.add(head1.left);
                    nodes1.add(head1.right);
                    TreeNode head2= nodes2.get(0);
                    nodes2.add(head2.left);
                    nodes2.add(head2.right);
                }
                nodes1.remove(0);
                nodes2.remove(0);
            }
        }
        return true;
    }
}
