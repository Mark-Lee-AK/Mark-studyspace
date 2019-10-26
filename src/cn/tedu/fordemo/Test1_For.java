package cn.tedu.fordemo;

public class Test1_For {
    //打印1~10
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print("  ");
            }
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print("  ");
            }
        }
        System.out.println();
        // 输出8,88,888,8888
        for (int i = 8; i <= 8888; i = i * 10 + 8) {
            System.out.print(i);
            if (i < 8888) {
                System.out.print(",");
            }
        }
    }
}
