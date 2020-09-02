package com.lianxi2.tree;

/**
 * @author james
 * @date 2020/8/28
 */
public class TestMain {

    public static void main(String[] args) {

        HeroNode root = new HeroNode(1, "aa");
        HeroNode node2 = new HeroNode(2, "dd");
        HeroNode node3 = new HeroNode(3, "cc");
        HeroNode node4 = new HeroNode(4, "ee");
        HeroNode node5 = new HeroNode(5, "nn");
        HeroNode node6 = new HeroNode(6, "xx");
        HeroNode node7 = new HeroNode(7, "uu");

        root.setLeft(node2);
        root.setRight(node3);

        node3.setLeft(node4);
        node3.setRight(node5);

        node2.setLeft(node6);
        node2.setRight(node7);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(root);

//        binaryTree.delNode(6);

//        binaryTree.preOrder();

        binaryTree.midOrder();

//        HeroNode heroNode = binaryTree.preOrderSearch(5);
//        System.out.println(heroNode);


    }

}
