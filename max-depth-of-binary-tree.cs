/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int MaxDepth(TreeNode root) {
        return MaxHeight(root, 0);
    }
    
    public int MaxHeight(TreeNode root, int maxHeight) {
        if(root == null) {
            return maxHeight;
        }
        
        int lMax = MaxHeight(root.left, maxHeight + 1);
        int rMax = MaxHeight(root.right, maxHeight + 1);
        if(lMax > rMax) {
            return lMax;
        } else {
            return rMax;
        }
    }

}