/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base Case:
        if (root == null) {
            return null;
        }
        
        // Initialize variables
        TreeNode ret = new TreeNode(root.val);
        
        // Invert tree
        recursiveTraversal(root, ret);
        
        // Return output
        return ret;
    
    }
    
    public static TreeNode recursiveTraversal(TreeNode root, TreeNode ret){
        // Base Case
        if(root == null){
            return null;
        }
        
        // Recursive Behavior
        if(root.right != null){
            ret.left = new TreeNode(root.right.val);
            recursiveTraversal(root.right, ret.left); 
        }
        if(root.left != null){
            ret.right = new TreeNode(root.left.val);
            recursiveTraversal(root.left, ret.right);  
        }
        
        return null;
    }
    
    
}