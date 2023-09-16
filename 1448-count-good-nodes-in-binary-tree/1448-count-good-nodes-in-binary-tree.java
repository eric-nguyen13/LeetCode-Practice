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
    static int ret = 1;
    public int goodNodes(TreeNode root) {
        // Base Case
        if(root == null) return 0;
        
        // Reset global variable for LC problem
        ret = 1;
        
        // Initialize Variables
        int min = root.val;
        
        // Recursive call
        recursiveCounter(root, min);
        
        // Return output
        return ret;
        
    }
    
    public static void recursiveCounter(TreeNode root, int min){
        // Base Case
        if(root == null) return;
        
        if(root.right != null){
            if(root.right.val >= min){
                System.out.println(root.right.val);
                ret++;
            }
            recursiveCounter(root.right, Math.max(min, root.right.val));
        }
        if(root.left != null){
            if(root.left.val >= min){
                System.out.println(root.left.val);
                ret++;
            }
            recursiveCounter(root.left, Math.max(min, root.left.val));
        }
        
    }
    
}

// Did by myself
// Preparation for Yext
// Lessons: Reiterated lessons on trees
// Tree traversal