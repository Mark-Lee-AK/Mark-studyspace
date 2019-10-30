package cn.tedu.api;

import java.util.Arrays;
import java.util.Scanner;

// 字符串的使用
public class Test2_String {
    public static void main(String[] args) {
        // 创建字符串
        //把值直接存入常量池，效率高
        String s = "abcdefghijk";
        //从指定位置获取对应的char字符
        System.out.println("索引为2的字符是: " + s.charAt(2));
        //判断是否以"efg"结尾
        System.out.println("该字符串是否以efg结尾: " + s.endsWith("efg"));
        //返回"f"字符出现的索引
        System.out.println("\"f\"字符在字符串中首次出现的位置是: " + s.indexOf("f"));
        //返回'a'在此字符串最后出现的索引
        System.out.println("\"a\"字符在字符串中最后一次出现的位置是: " + s.lastIndexOf('a'));
        //返回字符串长度
        System.out.println("该字符串的长度是: " + s.length());
        //返回从指定下标开始截取的新字符串,原来的字符串不变
        System.out.println("从第四个字符开始截取字符串: " + s.substring(3));
        System.out.println(s);
        //返回截取指定位置间的新字符串,含头不含尾
        System.out.println("截取第4个字符到第7个字符: " + s.substring(3, 7));

        String s1 = "1-2-3-4-5-6-7-8-9";
        // 给指定字符串按照规则切割成String[]数组
        String[] s2 = s1.split("-");
        System.out.println(Arrays.toString(s2));
        // 拿到数组后,遍历数组求和
        int sum = 0;
        for (int i = 0; i <s2.length ; i++) {
            //s2[i]根据下标获取每个元素,但是每个元素都是string类型的,无法求和
            // 需要把String类型的数据转成int类型,用Inter.pareInt(String s);
            sum += Integer.parseInt(s2[i]);//
        }
        System.out.println("这组数的和是: " + sum);
    }
}
