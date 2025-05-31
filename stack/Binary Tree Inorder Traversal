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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Traversal(root,inorder);
       return inorder;
    }
    public void Traversal(TreeNode root,List<Integer> inorder){
        if(root == null) return;
        Traversal(root.left,inorder);
        inorder.add(root.val);
        Traversal(root.right,inorder);
     }
}
