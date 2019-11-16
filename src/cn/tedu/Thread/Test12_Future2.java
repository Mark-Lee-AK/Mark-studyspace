package cn.tedu.Thread;

import java.util.concurrent.*;

public class Test12_Future2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        //将任务c1放入线程池
        C1 c1 = new C1();
        Future<Double> future = pool.submit(c1);

        pool.shutdown();

        System.out.println("继续执行主线程任务");
        System.out.println("在这里等待任务c1结束");

        Double d = future.get();
        System.out.println("c1执行完成,返回了:"+d);
    }
    static class C1 implements Callable<Double>{

        @Override
        public Double call() throws Exception {
            Thread.sleep(3000);
            return Math.random();
        }
    }
}
