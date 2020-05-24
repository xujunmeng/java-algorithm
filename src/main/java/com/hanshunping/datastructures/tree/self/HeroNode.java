package com.hanshunping.datastructures.tree.self;

/**
 * Created by jgsoft on 2020/5/23.
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

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public HeroNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //编写前序遍历的方法
    public void preOrder() {
        //先输出父节点
        System.out.println(this);
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void infixOrder() {
        //递归向左子树中序遍历
        if (this.left != null) {
            this.left.infixOrder();
        }
        //输出父节点
        System.out.println(this);
        //递归向右子树中序遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    //后序遍历
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //前序查找
    public HeroNode preOrderSearch(int no) {
        System.out.println("进入前序遍历");
        //比较当前节点是不是
        if (this.no == no) {
            return this;
        }

        //1.则判断当前节点的左子节点是否为空，如果不为空，则递归前序查找
        //2.如果左递归前序查找，找到节点，则返回
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(no);
        }
        //说明我们左子树找到
        if (resNode != null) {
            return resNode;
        }

        //右递归前序查找，找到节点，则返回，否则继续判断
        //当前的节点的右子节点是否为空，如果不空，则继续向右递归前序查找
        if (this.right != null) {
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }


    /**
     * 如果删除的节点时叶子节点，则删除该节点
     * 如果删除的节点时非叶子节点，则删除该子树（因为此时为非规则的树，所以先这样处理）
     */
    public void delNode(int no) {

        //如果当前节点的左子节点不为空，并且左子节点就是要删除节点，
        // 就将this.left = null；并且就返回（结束递归删除）
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }

        //如果当前节点的右子节点不为空，并且右子节点就是要删除节点，
        // 就将this.right = null;并且就返回（结束递归删除）
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }

        //如果上面步骤，没有删除节点，那么我们就需要向左子树进行递归删除
        if (this.left != null) {
            this.left.delNode(no);
        }

        //如果也没有删除节点，则应向右子树进行递归删除
        if (this.right != null) {
            this.right.delNode(no);
        }
    }


}
