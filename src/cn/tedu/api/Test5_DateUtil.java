package cn.tedu.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test5_DateUtil {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        method(s);
    }

    private static void method(String s) {
        // 创建日期格式化工具
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

        // 将字符串解析成Date
        try {
            Date birth = sdf.parse(s);
            Date today = new Date();
            long live = today.getTime() - birth.getTime();
            long day = live/1000/60/60/24;
            System.out.println("存活了:"+ day +"天");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
