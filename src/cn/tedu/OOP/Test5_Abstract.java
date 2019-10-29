package cn.tedu.OOP;

// 抽象类入门练习
public class Test5_Abstract {
    public static void main(String[] args) {
        human  h = new Student2();
        h.eat();h.play();h.sleep();
        // human h2 = new human(); 抽象类不能被实例化

    }
}
// 创建人类 抽象类
abstract class human{
    //普通方法
    public void sleep(){
        System.out.println("正在睡觉");
    }
    // 抽象方法
    abstract public void eat();
    abstract public void play();
}
// 创建子类
class Student2 extends human{
    @Override
    public void eat() {
        System.out.println("吃啥吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡你麻痹起来嗨");
    }

    @Override
    public void play() {
        System.out.println("嗨你麻痹回来睡");
    }
}