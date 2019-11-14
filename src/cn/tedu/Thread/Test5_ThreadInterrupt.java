package cn.tedu.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test5_ThreadInterrupt {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("按回车可以捅醒t1!");
                new Scanner(System.in).nextLine();
                t1.interrupt();
            }
        };
        // 将t2线程甚至为守护线程,所有前台线程结束时,虚拟机会自动退出
        t2.setDaemon(true);//如果不设置,即使倒数完都不会推出虚拟机
        t2.start();
    }
    static class T1 extends Thread{
        @Override
        public void run() {
            SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
            for (int i = 0; i < 10; i++) {
                String s = f.format(new Date());
                System.out.println(s);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("被打断");
                    break;
                }
            }
        }
    }
}
