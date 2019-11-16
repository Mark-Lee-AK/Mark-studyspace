package cn.tedu.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test11_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        // 将任务r1放入线程池
        R1 r1 = new R1();
        Future<?> future = pool.submit(r1);

        pool.shutdown();
        System.out.println("继续执行主线程任务");
        System.out.println("在这里等待任务r1结束");
        future.get();

        System.out.println("确认r1已结束");
    }

    static class R1 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
