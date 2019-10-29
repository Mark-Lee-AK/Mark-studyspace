package cn.tedu.OOP;

// 测试多态的使用
/*
1.多态中编译看左边,用的变量是父类的
2.多态中运行看右边,用的是子类的
3.多态中如果有静态资源,谁调用就执行谁
*/
public class Test4_Polym2 {
    public static void main(String[] args) {
        // 创建子类对象测试
        Circle c = new Circle();
        System.out.println(c.color);
        System.out.println(c.line);
        c.draw();

        System.out.println("___________________");
        // 创建多态对象测试
        Sharp s = new Circle();// 父类引用指向子类对象
        // 统一调用标准,编译看左边
        s.draw();//运行看右边
        System.out.println(s.color);
        System.out.println(s.line);
    }
}
//创建父类
class Sharp{
    //普通属性
    String color = "red";
    // 静态属性
    static int line = 4;
    // 方法
    public void draw(){
        System.out.println("Sharp...");
    }
}

//创建子类
class Circle extends Sharp{
    // 普通属性
    String color = "green";
    // 静态属性
    static int line = 6;
    // 方法重写：子类重写时，权限必须>=父类
    // private  void  draw(){ } private < 父类对应的方法权限
    public void draw(){
        System.out.println("Circle...");
    }
}
