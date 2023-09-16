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
    static int maxHeight = 0;
    public List<Integer> rightSideView(TreeNode root) {
        // Initialize Variables
        int tempHeight = 0;
        List<Integer> ret = new ArrayList<>();
        
        // Base Case
        if(root == null){
            return ret;
        }
        
        // Recursive call
        recursiveRightSide(root, ret, tempHeight);
        
        maxHeight = 0;
        // Return output
        return ret;
        
    }
    
    public static void recursiveRightSide(TreeNode root, List<Integer> ret, int tempHeight){
        // Base Case
        if(root == null){
            return;
        }
        
        // Append the right-most node of an unseen height
        if(tempHeight == maxHeight){
            ret.add(root.val);
            maxHeight++;
        }
        tempHeight++;
        System.out.println("Max: " + maxHeight);
        System.out.println("Min: " + tempHeight);
        
        // Recursive Calls
        if(root.right != null){
            recursiveRightSide(root.right, ret, tempHeight);
        }
        if(root.left != null){
            recursiveRightSide(root.left, ret, tempHeight);
        }
        
        
        // Potential return statement here?
        
    }
}