package com.lianxi2.list;

import org.junit.Test;

/**
 * @author james
 * @date 2020/8/20
 */
public class TestMain {

    @Test
    public void test() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        HouseNode houseNode1 = new HouseNode(1);
        HouseNode houseNode2 = new HouseNode(2);
        HouseNode houseNode3 = new HouseNode(3);
        HouseNode houseNode4 = new HouseNode(4);
        HouseNode houseNode5 = new HouseNode(5);

        singleLinkedList.add(houseNode1);
        singleLinkedList.add(houseNode2);
        singleLinkedList.add(houseNode3);
        singleLinkedList.add(houseNode4);
        singleLinkedList.add(houseNode5);

        singleLinkedList.showAll();

        int i = singleLinkedList.sumNode();
        System.out.println(i);

//        HouseNode houseNode = singleLinkedList.findLastIndexNode(3);

//        HouseNode houseNode = singleLinkedList.daoshuKNode2(3);
//        System.out.println(houseNode);
//
//        HouseNode reverseNode = singleLinkedList.reverse2(singleLinkedList.getHeadNode());
//        System.out.println(reverseNode);

        boolean b = singleLinkedList.ring2(singleLinkedList.getHeadNode());
        System.out.println(b);

    }



}
