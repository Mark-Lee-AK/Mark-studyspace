package cn.tedu.Thread.ProducerAndConsumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    // 创建容器 -> Queue 队列
    private Queue<Character> queue;

    // 含参构造
    public Producer(Queue<Character> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            // 生成随机字母拼接上'a',传给变量c
            char c = (char) ('a' + new Random().nextInt(26));
            synchronized (queue) {
                queue.offer(c);
                System.out.println("添加元素: " + c);
                queue.notifyAll();
            }
        }
    }
}
