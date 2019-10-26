package cn.tedu.Arraysdemo;

import java.util.Random;
/*nextInt(n)该方法的作用是生成一个随机的int值，
该值介于[0,n)的区间，也就是0到n之间的随机int值，
包含0而不包含n。*/
public class Test2_RandomArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10)+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1){
                System.out.print(",");
            }
        }
    }
}
