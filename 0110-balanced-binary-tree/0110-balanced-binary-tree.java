class Solution {
    static boolean flag;
    private static  int levels(TreeNode root) {
        if(root== null) return 0;
        int leftlevel=levels(root.left);
        int rightlevel=levels(root.right);
        if(Math.abs(leftlevel- rightlevel) >1) flag = false;
        return 1+Math.max( leftlevel, rightlevel);
    }
    public boolean isBalanced(TreeNode root) {
        if(root== null) return true;
        flag= true;
        levels(root);
        return flag;    
    }

    // private static  int levels(TreeNode root) {
    //     if(root== null) return 0;
    //     return 1+Math.max( levels(root.left), levels(root.right));
    // }
    // public boolean isBalanced(TreeNode root) {
    //     if(root== null) return true;
    //       int leftlevels= levels(root.left);
    //   int rightlevels= levels(root.right);
    //  if(Math.abs(leftlevels- rightlevels)>1) return false;
    //  return isBalanced(root.left)&& isBalanced(root.right);
            
    // }
}