package com.hanshunping.datastructures.tree.self;

/**
 * Created by jgsoft on 2020/5/23.
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        //先需要创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();

        //创建需要的节点
        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "哈哈");
        HeroNode node6 = new HeroNode(6, "乐乐");
        HeroNode node7 = new HeroNode(7, "米米");

        //说明，我们先手动创建该二叉树，后面我们学习递归的方式创建二叉树
        root.setLeft(node2);
        node2.setRight(node5);
        node2.setLeft(node6);

        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node7);

        binaryTree.setRoot(root);

        //测试
        System.out.println("前序遍历");
        //1 2 3 4
        binaryTree.preOrder();

//        binaryTree.infixOrder();

//        binaryTree.postOrder();

//        HeroNode heroNode = binaryTree.preOrderSearch(5);
//        System.out.println(heroNode);
    }



}
