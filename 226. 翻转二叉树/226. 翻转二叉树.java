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
        //LinkedList<Integer> res = new LinkedList<>();

        if(root == null){
            return null;
        }
        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);

        // res.addAll(l);
        // res.add(root);
        // res.addAll(r);
        root.left = r;
        root.right = l;
        return root;
    }
}