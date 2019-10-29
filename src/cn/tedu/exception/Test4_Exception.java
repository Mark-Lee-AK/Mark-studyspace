package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4_Exception {
    public static void main(String[] args) throws Exception {
        method();// 捕获异常处理
        method2();// 抛出异常处理
    }

    private static void method2() throws Exception {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("a / b = " + a / b);
    }

    private static void method() {
        try {
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            System.out.println("a / b = " + a / b);
        } catch (InputMismatchException i) {
            System.out.println("您的输入有误");
        } catch (ArithmeticException a) {
            System.out.println("分母不能为0");
        } catch (Exception e) {
            System.out.println("未知错误");
        } finally {
            System.out.println("结束");
        }
        // InputMismatchException
        // ArithmeticException


    }
}
