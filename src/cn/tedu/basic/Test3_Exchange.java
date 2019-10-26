package cn.tedu.basic;

import java.util.Scanner;

// 测试变量值交换
public class Test3_Exchange {
    public static void main(String[] args) {
        // 键盘接收a和b的值
        System.out.println("请输入变量a的值:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入变量b的值：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("交换前：a=" + a + ",b=" + b);

        //交换
        int t = a;
        a = b;
        b = t;

        //输出交换结果
        System.out.println("交换后：a=" + a + ",b=" + b);

    }
}
