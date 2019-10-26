package cn.tedu.basic;
//find the max num
public class Test6_Max {
    public static void main(String[] args) {
        // 三元运算符 1？2:3
        int a = 1;
        int b = 2;
        int c = 3;

        int max = a>b?a:b;
        max = max>c?max:c;

        //简写
        int max1 = (a>b?a:b)>c?(a>b?a:b):c;
        int max2 = a>b?(a>c?a:c):(b>c?b:c);

        System.out.println(max);
        System.out.println(max1);
        System.out.println(max2);
    }
}
