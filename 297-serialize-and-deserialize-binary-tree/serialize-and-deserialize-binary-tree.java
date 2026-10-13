/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    public void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0};
        return build(values, index);
    }

    public TreeNode build(String[] values, int[] index) {
        String value = values[index[0]++];

        if (value.equals("#")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value));
        root.left = build(values, index);
        root.right = build(values, index);

        return root;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));