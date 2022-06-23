class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // Initialize an arraylist
        ArrayList<Integer> vals = new ArrayList<>(); 
        // Pass parametes to recursive function
        recursive_inorderTraversal(root,vals); 
        return vals; 
    }
    
    public static void recursive_inorderTraversal(TreeNode root, ArrayList<Integer> vals) {
        // If root is null then return
        if(root == null)
            return; 
        //Traverse left to add every left side node you see 
        recursive_inorderTraversal(root.left,vals); 
        // Add the root node
        vals.add(root.val);
        // Traverse right to add every node on the right 
        recursive_inorderTraversal(root.right,vals); 
    }
}
