package com.junmeng.self.队列.用数组实现的队列;

/**
 * Created by jgsoft on 2019/2/24.
 */
public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();

//        queue.insert(50);
//        queue.insert(60);
//        queue.insert(70);
//        queue.insert(80);

        while (queue.isNotEmpty()) {
            Object obj = queue.remove();
            System.out.println(obj);
        }

    }

}
