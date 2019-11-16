package cn.tedu.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test10_ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool;

//        pool = Executors.newFixedThreadPool(5);
//        pool = Executors.newCachedThreadPool();
        pool = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 1000; i++) {
            pool.execute(new R1(i));
        }
    }
    static class R1 implements Runnable{
        int id;

        public R1(int id) {
            this.id = id;
        }
        @Override
        public void run() {
            String n = Thread.currentThread().getName();
            System.out.println(n+" : "+ id);
        }
    }
}
