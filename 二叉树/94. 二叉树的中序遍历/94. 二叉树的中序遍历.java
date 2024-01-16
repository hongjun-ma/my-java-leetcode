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
    ArrayList<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // ArrayList<Integer> res = new ArrayList<>();
        // if(root == null){
        //     return res;
        // }
        // res.addAll(inorderTraversal(root.left));
        // res.add(root.val);
        // res.addAll(inorderTraversal(root.right));
        // return res;

        traverse(root);
        return res;
    }
    void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}