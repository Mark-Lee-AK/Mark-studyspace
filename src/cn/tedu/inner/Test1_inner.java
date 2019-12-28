package cn.tedu.inner;
import cn.tedu.inner.A.Inner1;
/**
 * Create by Mark Lee
 * 2019/12/28 15:45
 */
public class Test1_inner {
    public static void main(String[] args) {
        // 静态内部类可以独立创建实例
        Inner1 inner1 = new Inner1();
        System.out.println(inner1);

        // 非静态内部类属于实例，必须有外部实例，再用外部实例创建内部实例
        A a = new A();
        A.Inner2 inner2 = a.new Inner2();
        System.out.println(inner2);
    }
}
class A{
    static class Inner1{

    }
    class Inner2{

    }
}