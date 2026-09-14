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
    long ans=0;
    long dfs(TreeNode root){
        if(root== null) return 0;

        long left= dfs(root.left);
        long right= dfs(root.right);

        ans+=Math.abs(left)+Math.abs(right);

        return root.val+left+right-1;
    }
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return (int)ans;
    }
}