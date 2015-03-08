package tree;

public class Test {
	static SymmetricTree st = new SymmetricTree();
	static SymmetricTree2 st2 = new SymmetricTree2();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode ta = new TreeNode(5);
		TreeNode tb = new TreeNode(4);
		TreeNode tc = new TreeNode(4);
		ta.left=tb;
		testSymmetric(ta);
		ta.right=tc;
		testSymmetric(tb);
	}
	
	public static void testSymmetric(TreeNode t){
		if(st2.isSymmetric(t))
			System.out.println("symmetric");
		else
			System.out.println("asymmetric");
	}

}
