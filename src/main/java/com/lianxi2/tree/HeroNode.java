package com.lianxi2.tree;

/**
 * @author james
 * @date 2020/8/28
 */
public class HeroNode {

    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void delNode(int no) {

        //如果当前节点左子节点不为空，并且左子节点就是要删除的节点。则this.left = null
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }

        //如果当前节点右子节点不为空，并且右子节点就是要删除的节点。则this.right = null
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }

        //如果上面两步没有删除节点，就需要向左子树进行递归删除
        if (this.left != null) {
            this.left.delNode(no);
        }

        //如果上面也没有删除，需要向右子树进行递归删除
        if (this.right != null) {
            this.right.delNode(no);
        }
    }

    //编写前序遍历的方法
    public void preOrder() {
        //先输出父节点
        System.out.println(this);

        //递归左子树
        if (this.left != null) {
            this.left.preOrder();
        }

        //递归右子树
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //编写前序遍历查找
    public HeroNode preOrderSearch(int no) {
        //比较当前节点是不是
        if (this.no == no) {
            return this;
        }

        HeroNode res = null;

        //左递归查找
        if (this.left != null) {
            res = this.left.preOrderSearch(no);
            if (res != null) {
                return res;
            }
        }

        //右递归查找
        if (this.right != null) {
            res = this.right.preOrderSearch(no);
            if (res != null) {
                return res;
            }
        }

        return res;
    }



}
