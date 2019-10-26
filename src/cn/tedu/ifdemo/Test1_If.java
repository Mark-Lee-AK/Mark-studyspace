package cn.tedu.ifdemo;

import java.util.Scanner;

public class Test1_If {
    public static void main(String[] args) {
        System.out.println("请输入商品价格");
        while (true) {
            double price = new Scanner(System.in).nextDouble();
            double newprice = method(price);
            System.out.println("折后价为：" + newprice + "元");
        }
    }

    public static double method(double price) {
        if (price >= 5000) {
            return 0.5 * price;
        } else if (price >= 2000) {
            return 0.8 * price;
        } else if (price >= 1000) {
            return 0.9 * price;
        }
        return price;
    }
}
