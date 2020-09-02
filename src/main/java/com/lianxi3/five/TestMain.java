package com.lianxi3.five;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 验证二叉搜索树
 *
 * 二叉搜索树「中序遍历」得到的值构成的序列一定是升序的，
 * 这启示我们在中序遍历的时候实时检查当前节点的值是否大于前一个中序遍历到的节点的值即可。
 * 如果均大于说明这个序列是升序的，整棵树是二叉搜索树，否则不是
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree/solution/yan-zheng-er-cha-sou-suo-shu-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * Created by jies on 2020/9/2.
 */
public class TestMain {

    @Test
    public void test() {
//        TreeNode treeNode = new TreeNode(4);
//        treeNode.left = new TreeNode(2);
//        treeNode.right = new TreeNode(5);
//
//        treeNode.left.left = new TreeNode(1);
//        treeNode.left.right = new TreeNode(3);
//
//        treeNode.right.right = new TreeNode(6);

          TreeNode treeNode = new TreeNode(1);
          treeNode.left = new TreeNode(1);

        List<Integer> list = new ArrayList<>();
        midSort(list, treeNode);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                return;
            }
            if (list.get(i) < list.get(i-1)) {
                System.out.println("sdf");
            }
        }



    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        midSort(list, root);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                return true;
            }
            if (list.get(i) <= list.get(i-1)) {
                return false;
            }
        }
        return true;
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
