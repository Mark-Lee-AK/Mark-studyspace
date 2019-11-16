package cn.tedu.Thread;

public class Test14_ThreadLocal {
    static ThreadLocal<Double> threadLocal = new ThreadLocal<Double>();

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                a();
                b();
                c();
                clearData();
            }
        }.start();
        new Thread(){
            public void run(){
                c();
                b();
                a();
                clearData();
            }
        }.start();
    }

    private static void clearData() {
        threadLocal.remove();
    }

    static void a(){
        String n = Thread.currentThread().getName();
        Double d = data();
        System.out.println(n+" : "+d);
    }
    static void b(){
        String n = Thread.currentThread().getName();
        Double d = data();
        System.out.println(n+" : "+d);
    }
    static void c(){
        String n = Thread.currentThread().getName();
        Double d = data();
        System.out.println(n+" : "+d);
    }

    static Double data() {
        Double d = threadLocal.get();
        if (d==null){
            d = Math.random();
            threadLocal.set(d);
        }
        return d;
    }
}
