package cn.tedu.Thread;

import java.util.Scanner;

// 1000万内有多少个质数
public class Test6_ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n------单线程------- ");
        f1();
        System.out.println("\n------5线程------- ");
        f2();
    }

    private static void f2() throws InterruptedException {
        System.out.println("你想用多少个线程来找出1000万以内的质数呢?");
        int n = new Scanner(System.in).nextInt();
        long t = System.currentTimeMillis();
        int m = 10000000/n;
        T1[] t1s = new T1[n];
        for (int i = 0; i < t1s.length; i++) {
            t1s[i]=new T1(m*i,m*(i+1));
            t1s[i].start();
        }
        int sum=0;
        for (T1 t1:t1s) {
            t1.join();
            sum += t1.count;
        }
        t = System.currentTimeMillis() -t;
        System.out.println("数量: " + sum);
        System.out.println("耗时: " + t);
    }

    private static void f1() throws InterruptedException {
        long t = System.currentTimeMillis();
        T1 t1 = new T1(0, 10000000);
        t1.start();
        //main线程暂停等待t1的执行结果
        t1.join();
        t = System.currentTimeMillis()-t;

        System.out.println("数量: " + t1.count);
        System.out.println("耗时: " + t);
    }
    static class T1 extends Thread{
        int from;
        int to;
        int count;//计数

        public T1(int from, int to) {
            if(from<3){
                from=3;
                count=1;
            }
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            for (int i = from; i < to; i++) {
                if (isPrime(i)){ // 判断i是否质数
                    count++;
                }
            }
        }

        private boolean isPrime(int i) {
            /*
            * 从2到 (根号i)+1
            * 找到能把i整除的数,i就不是质数
            * 都不能把i整除就是质数
            * */
            double d = Math.sqrt(i)+1;
            for (int j = 2; j < d; j++) {
                if (i%j==0){
                    return false;
                }
            }
            return true;
        }
    }
}
