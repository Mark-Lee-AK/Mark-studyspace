package cn.tedu.Thread;

public class Test16_Volatile2 {
    /*
    * 虽然保证了可见性,但是不保证运算的"原子性"
    * 原子性:一个线程执行期间,其他线程不能执行以下操作
    *       把下面多个不操作,整体看作是一步操作
    *       t=t+1;
    *       先复制t的值存到cpu告诉缓存
    *       执行+1运算
    *       把运算结果,写回告诉缓存的原地址
    *       再把cpu中的数据复制回内存
    * */
    public static volatile int t = 0;

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            //每个线程对t进行1000此加1的操作
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        synchronized (threads){
                            t=t+1;
                        }
                    }
                }
            });
            threads[i].start();
        }

        //等待所有累加线程都结束
        while (Thread.activeCount()>1){
            System.out.println(Thread.activeCount());
            Thread.yield();
        }
        // 打印t的值
        System.out.println(t);
    }
}
