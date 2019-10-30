package cn.tedu.api;

import java.util.Date;

// 测试日期类的用法
public class Test4_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());//毫秒值 1970-1-1 0点开始
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.toLocaleString());
    }
}
