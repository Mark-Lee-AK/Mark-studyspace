package cn.tedu.OOP;

// 测试多态     前提:继承+重写
public class Test3_Polym {
    public static void main(String[] args) {
        //创建子类对象测试
        Dog dog = new Dog();//
        dog.eat();
        //多态(向上转型):父类引用指向子类对象
        Animal animal = new Dog();
        // 编译看左边,只能用父类提供的功能,用来统一调用标准
        // 运行看右边:运行结果看子类的实现,如果重写了就是重写后的效果
        animal.eat();
    }
}
// 创建父类
class Animal{
    public void eat(){
        System.out.println("吃啥都行");
    }
}
// 创建子类
class Dog extends Animal{
    //重写父类功能
    public void eat(){
        System.out.println("狗吃屎");
    }
}