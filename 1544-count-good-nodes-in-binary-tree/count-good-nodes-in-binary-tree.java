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
    public int goodNodes(TreeNode root) {
        return count(root,Integer.MIN_VALUE);
    }
    public int count(TreeNode root,int maxsofar){
        if(root==null){
            return 0;
        }
        int good=0;
        if(root.val>=maxsofar){
            good=1;
        }
        maxsofar = Math.max(maxsofar, root.val);
        int left=count(root.left,maxsofar);
        int right=count(root.right,maxsofar);
        return good+left+right;
    }
}