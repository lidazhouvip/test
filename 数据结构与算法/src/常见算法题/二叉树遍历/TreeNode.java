package 常见算法题.二叉树遍历;

/**
 * @Author: Dazhou Li
 * @Description:二叉树节点
 * @CreateDate: 2019/4/10 0010 10:53
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        //super();
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
