package cn.tedu.OOP;

public class Test4_Inter2 {
    public static void main(String[] args) {
        Inter2 inter2 = new Inter2Impl();
        // inter2.sum = 20; // 常量无法修改
        System.out.println(inter2.sum);

        Inter2Impl i2 = new Inter2Impl();
        i2.eat();
        i2.show();
    }
}
// 创建接口
interface Inter2{
    // 接口里只有常量，自动为变量拼接public static final
    int sum = 10;
    public static final int avg = 100;

    // public abstract void eat(); // 接口的方法都是抽象方法，会自动补齐public abstract
    void eat();
}

interface Inter3{
    void show();
}

// 接口可以实现多继承，用逗号隔开，同时拥有多个接口的功能
interface Inter4 extends Inter2,Inter3{

}

class Inter2Impl implements Inter2,Inter3{
    @Override
    public void eat() {
        System.out.println("重写eat()方法");
    }

    @Override
    public void show() {
        System.out.println("重写来自Inter3的show()方法");
    }
}