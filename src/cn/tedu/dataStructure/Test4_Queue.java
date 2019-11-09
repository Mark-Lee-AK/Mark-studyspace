package cn.tedu.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Test4_Queue {
    public static void main(String[] args) {
        // LinkedList类实现了Queue接口,因此可以把LinkedList当做Queue来使用
        Queue<String> queue = new LinkedList<>();

        System.out.println("---- 入队 ----");
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String s :
                queue) {
            System.out.println("offer = " + s);
        }
        System.out.println("---- 出队 ----");
        while (!queue.isEmpty()) {
            // 返回第一个元素,并在队列中删除 - 出队
            System.out.println("返回并删除元素: " + queue.poll() + " | " + "剩余元素个数: " +queue.size());
        }


    }
}
