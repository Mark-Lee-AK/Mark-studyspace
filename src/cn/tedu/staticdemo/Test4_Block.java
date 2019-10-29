package cn.tedu.staticdemo;

// 测试代码块
// 总结:静态代码块>构造代码块>局部代码块
public class Test4_Block {
    public static void main(String[] args) {
        // 创建teacher对象
        // 先加载静态资源,在加载构造代码块
        // 静态资源之家在一次,构造代码块每次创建对象前都会调用
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        // 局部代码块
        t1.show();
    }
}
class Teacher{
    // 静态代码块：只加载一次
    static {
        System.out.println("静态代码块");
    }
    // 构造代码块:抽取构造方法的共性
    {
        System.out.println("构造代码块");
    }
    // 局部代码块：控制变量的作用范围
    public void show(){
        System.out.println("局部代码块");
    }
}