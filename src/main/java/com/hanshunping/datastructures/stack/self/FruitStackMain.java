package com.hanshunping.datastructures.stack.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class FruitStackMain {

    public static void main(String[] args) {

        FruitStack fruitStack = new FruitStack(5);

        fruitStack.push("apple");
        fruitStack.push("haha");
        fruitStack.push("lele");
        fruitStack.push("gaga");
        fruitStack.push("wowo");
        fruitStack.push("keke");

        fruitStack.pop();

        fruitStack.getAll();


    }

}
