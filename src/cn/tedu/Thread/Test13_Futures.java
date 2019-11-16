package cn.tedu.Thread;

import java.util.concurrent.*;

public class Test13_Futures {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future<Integer>[] a = new Future[5];
        for (int i = 0; i < 5; i++) {
            a[i]=pool.submit(new C1(2000000*i,2000000*(i+1)));
        }
        int sum = 0;
        for (Future<Integer> f:a) {
            sum += f.get();
        }
        System.out.println("质数的个数:" + sum);
        pool.shutdown();
    }
    static class C1 implements Callable<Integer>{
        int from;
        int to;
        int count;

        public C1(int from, int to) {
            if (from<3){
                from=3;
                count=1;
            }
            this.from = from;
            this.to = to;
        }

        @Override
        public Integer call() throws Exception {
            for (int i = from; i < to; i++) {
                if (isPrime(i)){
                    count++;
                }
            }
            return count;
        }

        private boolean isPrime(int i) {
            double end = Math.sqrt(i)+1;
            for (int j = 2; j < end; j++) {
                if (i%j==0){
                    return false;
                }
            }
            return true;
        }
    }
}
