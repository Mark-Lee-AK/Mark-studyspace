package cn.tedu.fordemo;

public class Test2_For2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------左直角三角形---------");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------打印99乘法表---------");
        for (int i = 1; i <9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("---------打印右直角三角形---------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------打印等腰三角形---------");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
