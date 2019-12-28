package cn.tedu.Thread;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test17_Lock {
    static char[] a = {'-', '-', '-', '-', '-'};
    static char c = '*';
    static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    lock.writeLock().lock();//乐观锁，效率更高
                    for (int i = 0; i < a.length; i++) {
                        a[i] = c;
                    }
                    lock.writeLock().unlock();
                    c = c == '-' ? '*' : '-';
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    lock.readLock().lock();
                    System.out.println(Arrays.toString(a));
                    lock.readLock().unlock();
                }
            }
        }.start();
    }
}
