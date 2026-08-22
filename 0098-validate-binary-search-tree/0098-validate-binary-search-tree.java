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
    long max = Long.MAX_VALUE;
    long min = Long.MIN_VALUE;
    public boolean isTree(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        return isTree(root.left,min,root.val) && isTree(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return isTree(root,min,max);
    }
}