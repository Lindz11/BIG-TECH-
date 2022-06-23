class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> vals = new ArrayList<>(); 
        recursive_postorderTraversal(root,vals); 
        return vals; 
    }
    
    public static void recursive_postorderTraversal(TreeNode root, ArrayList<Integer> vals) {
        if(root == null)
            return; 
        recursive_postorderTraversal(root.left,vals);
        recursive_postorderTraversal(root.right, vals);
        vals.add(root.val); 
    }
}
