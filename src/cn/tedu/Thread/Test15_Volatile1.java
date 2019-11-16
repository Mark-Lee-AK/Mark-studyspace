package cn.tedu.Thread;

public class Test15_Volatile1 {
    /*
     * volatile 保证数据的可见性
     *
     * volatile 涉及一些底层cpu指令
     * 可以让一个cpu缓存,监视其他CPU的数据变化
     * 发现其他cpu修改了数据,会把高速缓存数据标记成废弃
     * 重新从内存复制新数据
     * */
    public static volatile boolean flag = false;//共享变量

    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();

        new Thread(t1,"T1").start(); // 设置线程的name为T1
        Thread.sleep(1000);// 为保证t1比t2先启动,sleep一下
        new Thread(t2,"T2").start(); // 设置线程的name为T2
    }

    static class T1 extends Thread {
        @Override
        public void run() {
            while (true) {
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + " : " + flag);
                    break;
                }
            }
        }
    }

    static class T2 extends Thread {
        @Override
        public void run() {
            flag = true;
            System.out.println(Thread.currentThread().getName() + " : " + flag);
        }
    }
}
