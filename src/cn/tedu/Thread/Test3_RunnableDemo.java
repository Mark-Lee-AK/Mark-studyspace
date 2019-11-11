package cn.tedu.Thread;

public class Test3_RunnableDemo {
    public static void main(String[] args) {
        // 封装代码的对象
        R1 r1 = new R1();
        // 将代码交给线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        //两个线程启动后
        //都执行r1.run()
        t1.start();
        t2.start();
        //获取main线程
        Thread t = Thread.currentThread();
        String n = t.getName();
        System.out.println(n);
    }
    /**/
    static class R1 implements Runnable{
        @Override
        public void run() {
            Thread thread = Thread.currentThread();;
            String name = thread.getName();
            for (int i = 0; i < 1000; i++) {
                System.out.println(name+" : "+i);
            }
        }
    }
}
