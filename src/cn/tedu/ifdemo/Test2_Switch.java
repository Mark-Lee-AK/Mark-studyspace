package cn.tedu.ifdemo;

import java.util.Random;

public class Test2_Switch {
    public static void main(String[] args) {
        int num = new Random().nextInt(9);
        System.out.println("生成的数是" + num);
        switch (num) {
            case 0:
                System.out.println("不是这个数");
                break;
            case 1:
                System.out.println("不是这个数");
                break;
            case 2:
                System.out.println("不是这个数");
                break;
            case 3:
                System.out.println("不是这个数");
                break;
            case 4:
                System.out.println("不是这个数");
                break;
            case 5:
                System.out.println("哎哟不错哦~");
                break;
            case 6:
                System.out.println("不是这个数");
                break;
            case 7:
                System.out.println("不是这个数");
                break;
            default:
                System.out.println("找不到就算了嘛");
                break;
        }
    }
}
