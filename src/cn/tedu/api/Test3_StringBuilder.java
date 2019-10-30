package cn.tedu.api;

public class Test3_StringBuilder {
    public static void main(String[] args) {
        method2(); // 用StringBuilder的append()方法
        method();  // 用"+"
        method3();
    }

    private static void method3() {
        String str = "我是马云";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(str);
        sb.append(str);
        System.out.println(str);
        System.out.println(sb);
    }

    private static void method2() {
        String s = "abcdefghijklmnopqrstuvwxyz";

        // 把指定字符串拼接10000次
        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(s);// 用 + 拼接
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("用时: " + time + "ms");
    }

    private static void method() {
        // 创建字符串
        String s = "abcdefghijklmnopqrstuvwxyz";

        // 把指定字符串拼接10000次
        String result = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            result += s;// 用 + 拼接
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("用时: " + time + "ms");
    }
}
