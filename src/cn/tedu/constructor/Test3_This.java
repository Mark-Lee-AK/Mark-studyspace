package cn.tedu.constructor;

// 测试this的用法
public class Test3_This {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.show();
        Car2 c2 = new Car2("benz", "black");
        c2.show();
    }
}
class Car2{
    // 设置属性
    String model;
    String color;

    //构造方法
    public Car2() {
        //调用无参构造
        //this在构造方法中使用时,位置必须在第一条语句!!!!
        this("bmw","yellow");
        System.out.println("执行无参构造");
    } // 方便创建对象

    public Car2(String model, String color) {
        //同名时,this能够调用的是本类的成员(成员变量或成员方法)
        this.model = model;
        this.color = color;
        System.out.println("执行含参构造");
    }

    // 设置方法
    public void show(){
        String color = "出厂颜色";
        System.out.println(color);
        System.out.println(this.color);
    }
}
