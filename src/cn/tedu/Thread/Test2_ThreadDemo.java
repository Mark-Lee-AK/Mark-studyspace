package cn.tedu.Thread;

public class Test2_ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T1();

        t1.start();
        t2.start();
    }
    /*
    * 用来封装代码
    * run()方法代码要放入线程执行
    * */
    static class T1 extends Thread{
        @Override
        public void run() {
            // 获取线程名
            String name = getName();
            for (int i = 0; i < 1000; i++) {
                System.out.println(name + ":" + i);
            }
        }
    }
}
