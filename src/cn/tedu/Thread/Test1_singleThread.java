package cn.tedu.Thread;

public class Test1_singleThread {
    public static void main(String[] args) {
        exec();
    }

    private static void exec() {
        System.out.println("exec start");
        fn1();
        fn2();
        System.out.println("exec end");
    }

    private static void fn2() {
        System.out.println("fn2()run");
    }

    private static void fn1() {
        System.out.println("fn1()run");
    }
}
