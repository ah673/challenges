package tree.lowestcommonancestor;
/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST. 
 * @author amyho
 *
 */
public class TreeLowestCommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( p == null && q == null ){
            return null;
        }
        int value = root.val;
        if ( value < p.val && value < q.val ){
            return lowestCommonAncestor( root.right, p, q );
        } else if ( value > p.val && value > q.val ){
            return lowestCommonAncestor( root.left, p, q );
        } else {
            return root;
        }
    }
	
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode( int value ){
			this.val = value;
		}
	}

	
}

