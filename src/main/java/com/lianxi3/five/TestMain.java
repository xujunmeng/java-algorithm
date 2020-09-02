package com.lianxi3.five;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jies on 2020/9/2.
 */
public class TestMain {

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(6);

        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(2);

        List<Integer> list = new ArrayList<>();
        midSort(list, treeNode);


    }

    public boolean isValidBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return false;
        }

        return false;
    }

    public void midSort(List<Integer> list, TreeNode root) {
        //递归向左子树中序遍历
        if(root.left != null) {
            midSort(list, root.left);
        }
        //输出父结点
        list.add(root.val);
        //递归向右子树中序遍历
        if(root.right != null) {
            midSort(list, root.right);
        }
    }

}
