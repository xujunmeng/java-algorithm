package com.lianxi2.tree;

/**
 * @author james
 * @date 2020/8/28
 */
public class BinaryTree {

    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //删除节点
    public void delNode(int no) {
        if (root == null) {
            System.out.println("空的");
        }

        if (root.getNo() == no) {
            root = null;
        } else {
            root.delNode(no);
        }
    }

    //前序遍历
    public void preOrder() {
        if (root == null) {
            System.out.println("空的");
        }
        this.root.preOrder();
    }

    //前序遍历查找
    public HeroNode preOrderSearch(int no) {
        if (root == null) {
            System.out.println("空的");
        }
        return root.preOrderSearch(no);
    }
}
