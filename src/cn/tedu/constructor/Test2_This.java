package cn.tedu.constructor;

// 测试this的用法
public class Test2_This {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.show();
        Car c2 = new Car("benz", "black");
        c2.show();
    }
}
class Car{
    // 设置属性
    String model;
    String color;

    //构造方法
    public Car() {} // 方便创建对象

    public Car(String model, String color) {
        //同名时,this能够调用的是本类的成员(成员变量或成员方法)
        this.model = model;
        this.color = color;
    }

    // 设置方法
    public void show(){
        String color = "出厂颜色";
        System.out.println(color);
        System.out.println(this.color);
    }
}
