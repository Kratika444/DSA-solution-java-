class Solution {
    public void flatten(TreeNode root) {
        if(root== null) return;
        TreeNode lst = root.left;
        TreeNode rt = root.right;
        root.left = null;
        root.right = null;
        flatten(lst);
        flatten(rt);
        root.right = lst;
        TreeNode last = root;
        while (last.right != null)
            last = last.right;

        last.right = rt;
    }

    // public void flatten(TreeNode root) {
    //     if(root== null) return;
    //     ArrayList<TreeNode> arr= new ArrayList<>();
    //     preorder(root, arr);

    //     for(int i=0;i<arr.size()-1;i++){
    //         TreeNode a= arr.get(i);
    //         TreeNode b = arr.get(i+1);
    //         a.right=b;
    //         a.left= null;
    //     }
    //     TreeNode last= arr.get(arr.size()-1);
    //     last.left= null;
    //     last.right= null;
    // }
    // public void preorder(TreeNode root, ArrayList<TreeNode> arr){
    //     if(root== null) return ;
    //     arr.add(root);
    //     preorder(root.left, arr);
    //     preorder(root.right, arr);
    // }

}