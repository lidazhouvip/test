package 常见算法题.二叉树遍历;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: Dazhou Li
 * @Description:二叉树的五种遍历
 * @CreateDate: 2019/4/10 0010 10:56
 */
public class TreeSort {
    public static void main(String[] args) {
        TreeNode node10 = new TreeNode(10, null, null);
        TreeNode node9 = new TreeNode(8, null, null);
        TreeNode node8 = new TreeNode(9, null, node10);
        TreeNode node7 = new TreeNode(4, null, null);
        TreeNode node6 = new TreeNode(5, node8, node9);
        TreeNode node5 = new TreeNode(6, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        TreeNode node3 = new TreeNode(2, node4, node5);
        TreeNode node2 = new TreeNode(3, node6, node7);
        TreeNode node1 = new TreeNode(1, node2, node3);

        TreeSort tree = new TreeSort();

        System.out.println("----前序遍历----");
        tree.preOrder(node1);   //递归方式
        System.out.println();

        tree.preOrder2(node1);  //非递归方式
        System.out.println();

        System.out.println("----中序遍历----");
        tree.inOrder(node1);    //递归方式
        System.out.println();

        tree.inOrder2(node1);
        System.out.println();

        System.out.println("----后续遍历----");
        tree.postOrder(node1);   //递归方式
        System.out.println();

        tree.postOrder2(node1);  //非递归方式
        System.out.println();

        System.out.println("----深度优先遍历----");
        tree.depthFirstOrder(node1);
        System.out.println();

        System.out.println("----广度（宽度）优先遍历----");
        tree.breadthFirstOrder(node1);
        System.out.println();
    }

    //递归的前序遍历
    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //非递归前序遍历---用栈实现
    private void preOrder2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    //递归的中序遍历
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //非递归的中序遍历--栈
    private void inOrder2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (!stack.isEmpty()) {
                cur = stack.pop();
                System.out.print(cur.val + " ");
                cur = cur.right;
            }
        }
    }

    //递归的后续遍历
    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //非递归的后续遍历--2个栈
    private void postOrder2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode node=stack1.pop();
            stack2.push(node);
            if (node.left!=null){
                stack1.push(node.left);
            }
            if (node.right!=null){
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().val+" ");
        }
    }

    //深度优先遍历--栈
    private void depthFirstOrder(TreeNode root) {
        if (root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val+" ");
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
    }

    //广度（宽度）优先遍历--双端队列
    private void breadthFirstOrder(TreeNode root) {
        if (root==null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.pollFirst();
            System.out.print(node.val+" ");
            if(node.left!=null){
                queue.addLast(node.left);
            }
            if(node.right!=null){
                queue.addLast(node.right);
            }
        }
    }


}
