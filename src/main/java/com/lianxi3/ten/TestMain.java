package com.lianxi3.ten;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author james
 * @date 2020/9/16
 */
public class TestMain {

    List<TreeNode> list = Lists.newArrayList();

    public static void main(String[] args) {
        //创建需要的节点
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        root.setLeft(node2);
        node2.setLeft(node6);
        node2.setRight(node5);

        root.setRight(node3);
        node3.setLeft(node7);
        node3.setRight(node4);

        List<TreeNode> traversal = new TestMain().traversal(root);
        for (TreeNode treeNode : traversal) {
            System.out.println(treeNode.val);
        }


    }

    public List<TreeNode> traversal(TreeNode root) {
        dfs(root);
        return list;
    }

    /**
     * 深度优先遍历
     * @param root
     */
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }

}
