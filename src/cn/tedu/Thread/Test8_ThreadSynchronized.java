package cn.tedu.Thread;

import java.util.Arrays;

public class Test8_ThreadSynchronized {
    static char[] a = {'-', '-', '-', '-', '-'};
    static char c = '*';

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        for (int i = 0; i < a.length; i++) {
                            a[i] = c;
                        }
                    }
                    c = c == '-' ? '*' : '-';
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        System.out.println(Arrays.toString(a));
                    }
                }
            }
        }.start();
    }
}
