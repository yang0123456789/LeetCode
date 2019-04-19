package Tree;

public class _437{
    private int cnt = 0;

    public int pathSum(TreeNode root, int sum) {
        preorder(root, sum);
        return cnt;
    }

    public void preorder(TreeNode root, int sum) {
        if (root == null)
            return;
        dfs(root, sum);
        preorder(root.left, sum);
        preorder(root.right, sum);
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null)
            return;
        if (root.val == sum)
            cnt++;
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
    }
}
