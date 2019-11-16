package cn.tedu.Thread;

public class Test9_ThreadSynchronized2 {
    public static void main(String[] args) {
        R1 r1 = new R1();
        Thread t1 = new Thread(r1);
        t1.start();

        while (true){
            int i = r1.get();
            System.out.println(i);
            if (i%2==1){
                System.out.println(i);
                System.exit(0);//关闭虚拟机
            }
        }
    }
    static class R1 implements Runnable{
        static int i = 0;
        public synchronized void add(){
            i++;
            i++;
        }
        public synchronized int get(){
            return i;
        }

        @Override
        public void run() {
            while (true){
                add();
            }
        }
    }
}
