class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return build(0, n - 1, 0, n - 1, inorder, preorder);
    }
    public TreeNode build(int prelo, int prehi, int inlo, int inhi, int inorder[], int[] preorder) {
        if (prelo > prehi || inlo > inhi) return null;
        int val = preorder[prelo];
        TreeNode root = new TreeNode(val);
        int r = -1;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }
        int cnt = r - inlo; // no of elements in left binary tree;
        root.left = build(prelo + 1, prelo + cnt, inlo, r - 1, inorder, preorder);
        root.right = build(prelo + cnt + 1, prehi, r + 1, inhi, inorder, preorder);
        return root;
    }
}