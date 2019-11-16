package cn.tedu.Thread.ProducerAndConsumer;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);
        producer.start();
        consumer.start();
    }
}
