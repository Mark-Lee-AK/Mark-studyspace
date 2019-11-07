package cn.tedu.generics;

public class Test2_NewStyle {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{100, 99, 89, 77};
        String[] names = {"语文", "数学", "英语", "JAVA"};
        Double[] money = {1000.5,20.12,30.3,50.1};

        Test2_NewStyle.print(scores);
        Test2_NewStyle.print(names);
        Test2_NewStyle.print(money);
    }

    private static <E> void print(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
