package cn.tedu.Arraysdemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class Test5_ArraysMethod {
    @Test
    public void expand() {
        // 创建随机数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        // 扩容,Arrays.copyOf();
        // copyOf会产生新的数组

        int newLength = arr.length + arr.length / 2;
        System.out.println("原数组长度：" + arr.length);
        System.out.println("新数组长度：" + newLength);

        int[] newarr = Arrays.copyOf(arr, newLength);
        System.out.println(Arrays.toString(newarr));
    }

    //缩容
    @Test
    public void reduce() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //缩容到4个元素
        int[] brr = Arrays.copyOf(arr, 4);
        System.out.println("原数组：" + Arrays.toString(arr));
        System.out.println("新数组：" + Arrays.toString(brr));
        // 隐患,缩容时会丢失数据
    }

    //排序
    @Test
    public void invertedOrder() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前" + Arrays.toString(arr));
        Arrays.sort(arr);// sort()方法不会新建新数组，只会在原来数组里排序
        System.out.println("排序后" + Arrays.toString(arr));

        // 倒序
        int[] brr = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            brr[i] = arr[arr.length-i-1];
        }
        System.out.println("倒序后" + Arrays.toString(brr));
    }
}
