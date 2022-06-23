class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // Initialize an arraylsit at the top 
        ArrayList<Integer> vals = new ArrayList<>(); 
        // Recursively go through each binary tree
        recursive_preorderTraversal(root, vals); 
        return vals; 
    }
    
    public static void recursive_preorderTraversal(TreeNode root, ArrayList<Integer> vals) {
        // Base case if the root we have based into the function is null return
        if(root == null)
            return; 
        // If not then add the value 
        vals.add(root.val); 
        // Go as far left as possible
        recursive_preorderTraversal(root.left, vals);
        // Then go as far right as possible
        recursive_preorderTraversal(root.right, vals); 
    }
}
