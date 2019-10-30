package cn.tedu.big;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_BigDecimal {
    public static void main(String[] args) {
        // 键盘接收两个小数
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        // 普通运算
        System.out.println("---普通运算结果---");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));// 不精确
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));// 不精确
        System.out.println();

        System.out.println("---BigDecimal---");
        BigDecimal bd1 = BigDecimal.valueOf(a);
        BigDecimal bd2 = BigDecimal.valueOf(b);

        System.out.println(bd1.add(bd2).doubleValue());
        System.out.println(bd1.subtract(bd2).doubleValue());
        System.out.println(bd1.multiply(bd2).doubleValue());
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
