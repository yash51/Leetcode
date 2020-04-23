package my.com.leetcode;

public class ConstructBSTPreorder {
	
	public static TreeNode bstFromPreorder(int[] preorder) {
		
	     return helper(preorder, 0, preorder.length - 1);   
	    }
	    
	    private static TreeNode helper(int[] preorder, int start, int end) {
	        if(start > end) return null;
	        
	        TreeNode node = new TreeNode(preorder[start]);
	        int i;
	        for(i=start;i<=end;i++) {
	        if(preorder[i] > node.val)
	            break;
	        }
	        
	        node.left = helper(preorder, start+1, i-1);
	        node.right = helper(preorder, i, end);
	        return node;
	        
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,5,1,7,10,12};
		bstFromPreorder(a);
	}

}
