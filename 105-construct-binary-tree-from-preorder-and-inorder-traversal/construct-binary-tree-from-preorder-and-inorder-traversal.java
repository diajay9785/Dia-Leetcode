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
    int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return built(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode built(int[] preorder,int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preindex++]);
        int index=start;
        while(inorder[index]!=root.val){
            index++;
        }
        root.left=built(preorder,inorder,start,index-1);
        root.right=built(preorder,inorder,index+1,end);
        return root;
    }
}