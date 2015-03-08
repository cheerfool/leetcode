package tree;

import java.util.LinkedList;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        int total=0;
        LinkedList<TreeNode> nodeQ= new LinkedList<TreeNode>();
        LinkedList<Integer> numQ= new LinkedList<Integer>();
        nodeQ.offer(root);
        numQ.offer(root.val);
        while(nodeQ.size()>0){
            TreeNode cur= nodeQ.poll();
            int value= numQ.poll();
            if(cur.left==null && cur.right==null){
                total+= value;
            }else{
                if(cur.left!=null){
                    nodeQ.offer(cur.left);
                    numQ.offer(value*10+cur.left.val);
                }   
                if(cur.right!=null){
                    nodeQ.offer(cur.right);
                    numQ.offer(value*10+cur.right.val);
                }
            }
        }
        return total;
    }
}
