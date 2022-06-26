class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        recursiveinvertTree(root); 
        return root; 
    }
    
    public static void recursiveinvertTree(TreeNode root) {
        if(root == null)
            return; 
        if(root.left == null & root.right == null)
            return; 
        TreeNode left,right = null; 
        left = root.left;
        right = root.right; 
        root.left = right; 
        root.right = left; 
        recursiveinvertTree(root.left); 
        recursiveinvertTree(root.right);
    }
}
