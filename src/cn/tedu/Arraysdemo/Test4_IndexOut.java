package cn.tedu.Arraysdemo;

import java.util.Arrays;

public class Test4_IndexOut {
    // 如果数组长度只有5，偏偏访问第6个元素就会报异常
    // 越界异常

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println("数组长度是：" + arr.length);
        System.out.println("数组最后的下标应该是：" + (arr.length - 1));
        System.out.println("作死般尝试访问arr[10]");
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("异常类型：" + e.getClass());
            System.out.println("异常信息：" + e.getMessage());
        }
    }
}
