package com.lianxi3.five;

import org.junit.Test;

/**
 * Created by jies on 2020/9/2.
 */
public class TestMain {

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        Boolean b = isValidBST(treeNode);
        System.out.println(b);
    }

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return false;
        }

        int curVal = root.val;

        TreeNode leftNode = root.left;

        int leftVal = leftNode.val;

        TreeNode rightNode = root.right;

        int rightVal = rightNode.val;

        if (curVal > leftVal || curVal < rightVal) {
            return false;
        }





        return true;
    }

}
