package cn.tedu.Scanner;

import java.util.Scanner;

//求圆的面积
public class Test2_Area {
    public static void main(String[] args) {
        // 1、定义一个double类型变量 记录半径
        // 键盘输入
        System.out.println("请输入圆的半径：");
        double r = new Scanner(System.in).nextDouble();
        System.out.println("该圆的周长是：" + 3.14 * 2 * r);
        System.out.println("该圆的面积是：" + 3.14 * r * r);
    }
}
