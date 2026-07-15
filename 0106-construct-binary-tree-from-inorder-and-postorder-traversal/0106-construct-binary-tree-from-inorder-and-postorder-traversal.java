
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return build(0, n - 1, 0, n - 1, inorder, postorder);
    }
    public TreeNode build(int postlo, int posthi, int inlo, int inhi, int inorder[], int[] postorder) {
        if ( inlo > inhi||postlo > posthi ) return null;
        int val = postorder[posthi];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }
        int lcnt= r-inlo;// no of elements in left subtree;
        int cnt = inhi - r ; // no of elements in right subtree;
        root.left = build(postlo , postlo+lcnt-1, inlo, r - 1, inorder, postorder);
        root.right = build(postlo + lcnt , posthi-1, r + 1, inhi, inorder, postorder);
        return root;
    }
    
}