package cn.tedu.OOP;

// 定义接口 - interface 关键字
public interface Test7_Inter1 {
    // 定义抽象方法
    abstract public void show();
    // 只能有抽象方法,不能有普通方法
    //public void eat(){}
    void eat();//可省略 abstract public
}
// 创建子类 - 子类和接口是实现关系，用implements关键字
// abstract class InterImple implements Test7_Inter1{} //还是一个抽象类
class InterImple implements Test7_Inter1{

    // 重写抽象方法
    @Override
    public void show() {
        System.out.println("重写抽象方法show()");
    }
    @Override
    public void eat() {
        System.out.println("重写抽象方法eat()");
    }
}