package cn.tedu.Thread.ProducerAndConsumer;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Character> queue;

    public Consumer(Queue<Character> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()){
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Character c = queue.poll();
                System.out.println("取出元素: " + c);
            }
        }
    }
}
