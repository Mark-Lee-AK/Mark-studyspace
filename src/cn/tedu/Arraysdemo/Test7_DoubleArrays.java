package cn.tedu.Arraysdemo;

import java.util.Arrays;

/*
 * 二维数组可以用一维表达，多维度难以理解，增加了读程和理解代码的时间，同时增加了代码的复杂度，不易维护。所以实际开发中不推荐，用的很少。
 * 通过两层for循环进行遍历，二层for循环的技巧大家多关注，这个实际项目中用的颇多。
 */
public class Test7_DoubleArrays {
    public static void main(String[] args) {
        System.out.println("一维数组表示:");
        String[] p1 = {"Stank", "99", "95", "97"};
        System.out.println(Arrays.toString(p1));
        String[] p2 = {"Sour", "88", "99", "77"};
        System.out.println(Arrays.toString(p2));

        System.out.println("二维数组表示");
        String[][] p = new String[2][4];
        p[0][0] = "Stank";
        p[0][1] = "99";
        p[0][2] = "95";
        p[0][3] = "97";
        p[1][0] = "Sour";
        p[1][1] = "88";
        p[1][2] = "99";
        p[1][3] = "77";

        System.out.println("第一维长度是："+p.length);
        System.out.println("第二维长度是："+p[0].length);

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                System.out.println("坐标：("+i+","+j+") = " + p[i][j]);
            }
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(p[0]));
        System.out.println(Arrays.toString(p[1]));
    }
}
