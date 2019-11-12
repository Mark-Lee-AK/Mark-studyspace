package cn.tedu.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4_ThreadSleep {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
    }
    static class T1 extends Thread{
        @Override
        public void run() {
            SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
            while(true){
                String date = f.format(new Date());
                System.out.println(date);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
