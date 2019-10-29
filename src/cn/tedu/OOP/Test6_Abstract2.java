package cn.tedu.OOP;

// 抽象类的用法
public class Test6_Abstract2 {
    public static void main(String[] args) {
        Father f = new Son();
        f.eat();
        f.sleep();// 父类的方法，子类实现
    }
}

// 创建父类,提供构造方法
abstract class Father {
    // 抽象类中可以有构造方法
    // 抽象类不能创建对象，所以抽象类的构造方法不是为了自己创建的，而是为了子类创建对象

    public Father() {
        int sum = 10;//抽象类中可以写变量
        final String country = "china";//抽象类中也可以有常量
        System.out.println("父类的构造方法");
    }

    // 抽象方法
    abstract public void sleep();

    // 抽象类中可以有普通方法
    public void eat() {
        System.out.println("抽象类中可以有普通方法");
    }
}

// 创建子类
class Son extends Father {
    public Son() {
        // super(); // 调用父类的无参构造,默认缺省补齐
        System.out.println("子类的构造方法");
    }

    @Override
    public void sleep() {
        System.out.println("睡你麻痹起来嗨");
    }
}