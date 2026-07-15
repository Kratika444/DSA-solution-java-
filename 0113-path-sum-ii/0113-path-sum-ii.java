
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        dfs(root, ans, arr, targetSum);
        return ans;
    }

    public static void dfs(TreeNode root, List<List<Integer>> ans, List<Integer> arr, int sum) {
        if (root == null)
            return;
        arr.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            ans.add(new ArrayList<>(arr));
        }

        if (root.left != null)
            dfs(root.left, ans, arr, sum - root.val);
        if (root.right != null)
            dfs(root.right, ans, arr, sum - root.val);

        arr.remove(arr.size() - 1);
    }
}