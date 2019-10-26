package cn.tedu.basic;

/*
运算规则
 1.运算结果的数据类型与最大的类型一致
 2.byte,short,char三种比int小的整数,运算时会自动转换成int
 3.整数运算会溢出,运算结果超过该数据类型的时候会溢出
 4.浮点数运算不精确
 5.浮点数的特殊值:Infinity无穷大 -> 3.14/0, NaN -> 0/0.0
*/

public class Test5_Computations {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        //byte c = a+b;报错，因为a和b相加会自动转换成int，大转小要强制转换
        //正确写法
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
