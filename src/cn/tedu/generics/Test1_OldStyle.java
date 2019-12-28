package cn.tedu.generics;

//传统方式通过重载多态实现，方法同名，参数类型不同。
public class Test1_OldStyle {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{100, 99, 89, 77};
        String[] names = {"语文", "数学", "英语", "JAVA"};

        Test1_OldStyle.print(scores);
        Test1_OldStyle.print(names);
    }

    private static void print(String[] names) {
        for (String s : names) {
            System.out.println(s);
        }
    }

    private static void print(Integer[] scores) {
        for (Integer i : scores) {
            System.out.println(i);
        }
    }

}
