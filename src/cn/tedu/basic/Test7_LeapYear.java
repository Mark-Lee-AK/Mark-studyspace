package cn.tedu.basic;

import java.util.Scanner;

//求输入的年份是否闰年
public class Test7_LeapYear {

    public static void main(String[] args) {
        System.out.println("请输入年份");
        int year = new Scanner(System.in).nextInt();
        if (method(year)){
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年是平年");
        }
    }
    private static boolean method(int year) {
        if((year%400==0)||(year%4==0)&&(year%100!=0)){
            return true;
        }
        return false;
    }

}
