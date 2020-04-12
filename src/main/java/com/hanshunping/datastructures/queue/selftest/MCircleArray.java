package com.hanshunping.datastructures.queue.selftest;

/**
 * Created by jgsoft on 2020/4/12.
 */
public class MCircleArray {

    private int frontIndex;

    private int rearIndex;

    private int arrMaxSize;

    private Object[] arrData;

    public MCircleArray(int arrMaxSize) {
        this.frontIndex = 0;
        this.rearIndex = 0;
        this.arrMaxSize = arrMaxSize;
        this.arrData = new Object[arrMaxSize];
    }

    public void add(Object obj) {
        if (isFull()) {
            throw new RuntimeException("满了");
        }
        //判断是否满了

        //给rearIndex的位置赋值
        arrData[rearIndex] = obj;

        //考虑环形问题，给rearIndex设置值
        rearIndex = (rearIndex + 1) % arrMaxSize;
    }

    public Object out() {

        //是否为空
        if (isEmpty()) {
            throw new RuntimeException("空了");
        }

        Object obj = arrData[frontIndex];

        arrData[frontIndex] = null;

        frontIndex = (frontIndex + 1) % arrMaxSize;

        return obj;
    }

    public boolean isFull() {
        return (rearIndex + 1) % arrMaxSize == frontIndex;
    }

    public boolean isEmpty() {
        return rearIndex == frontIndex;
    }

    public void showAll() {
        for (int i = frontIndex; i < frontIndex + getArrDataSize(); i++) {
            System.out.println( arrData[i % arrMaxSize] );
        }
    }

    public int getArrDataSize() {
        return (rearIndex - frontIndex + arrMaxSize) % arrMaxSize;
    }

    public static void main(String[] args) {
        MCircleArray mCircleArray = new MCircleArray(5);
        mCircleArray.add(10);
        mCircleArray.add(20);
        mCircleArray.add(30);
        mCircleArray.add(40);
        mCircleArray.out();
        mCircleArray.out();
        mCircleArray.out();
        mCircleArray.add(50);
        mCircleArray.add(60);
        mCircleArray.showAll();
    }
}
