package com.lianxi3.ten;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * https://blog.csdn.net/l947069962/article/details/84786140
 * @author james
 * @date 2020/9/16
 */
public class TestMain2 {

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

        List<List<TreeNode>> traversal = new TestMain2().traversal(root);

        for (List<TreeNode> treeNodes : traversal) {
            for (TreeNode treeNode : treeNodes) {
                System.out.print(treeNode.val);
            }
            System.out.println();

        }

    }

    public List<List<TreeNode>> traversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<List<TreeNode>> list = Lists.newArrayList();

        bfs(root, 0, list);
        return list;
    }

    /**
     * 广度优先遍历
     */
    private void bfs(TreeNode root, int level, List<List<TreeNode>> list) {
        if (root == null) {
            return;
        }
        if (level >= list.size()) {
            List<TreeNode> subList = Lists.newArrayList();
            subList.add(root);
            list.add(subList);
        } else {
            list.get(level).add(root);
        }
        bfs(root.left, level+1, list);
        bfs(root.right, level+1, list);


    }

}
