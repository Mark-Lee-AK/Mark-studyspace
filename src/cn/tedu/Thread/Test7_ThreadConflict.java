package cn.tedu.Thread;

public class Test7_ThreadConflict {
    static char[] a = {'-','-','-','-','-'};
    static char c = '*';

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true){
                    for (int i = 0; i < a.length; i++) {
                        a[i] = c;
                    }
                    c = (c=='*'?'-':'*');
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println(a);
                }
            }
        }.start();
    }
}
