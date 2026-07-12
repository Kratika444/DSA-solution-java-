
class Solution {
    public static boolean exists(TreeNode root, int val){
        if(root== null) return false;
        if(root.val== val) return true;
        return exists(root.left, val)|| exists(root.right, val); 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null) return null;
       if(root == p|| root== q) return root;
       boolean pinleft= exists(root.left, p.val);
       boolean qinleft= exists(root.left, q.val);
       if(pinleft&& qinleft) return lowestCommonAncestor(root.left, p, q);
       else if(!pinleft && !qinleft) return lowestCommonAncestor(root.right,p,q);
       else return root;
    } 
}