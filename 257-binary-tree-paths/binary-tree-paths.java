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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list=new ArrayList<>();
        dfs(root,"",list);
        return list;
    }
    public void dfs(TreeNode root,String path,ArrayList<String> list){
        if(root==null){
            return;
        }
        String newPath = path.isEmpty()? String.valueOf(root.val): path + "->" + root.val;
        if(root.left==null && root.right==null){
            list.add(newPath);
            return;
        }
        dfs(root.left, newPath, list);
        dfs(root.right, newPath, list);
    }
}