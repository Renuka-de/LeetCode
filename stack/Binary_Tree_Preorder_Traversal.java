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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        Traversal(root,preorder);
        return preorder;
    }
    public void Traversal(TreeNode root,List<Integer> preorder){
        if (root == null) return;
        preorder.add(root.val);
        Traversal(root.left,preorder);
        Traversal(root.right,preorder);

    }
}
