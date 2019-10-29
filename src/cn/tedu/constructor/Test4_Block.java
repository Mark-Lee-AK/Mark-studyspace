package cn.tedu.constructor;

//测试代码块
/*
构造代码块
1、 在类的内部，方法外部的代码块。
2、 通常用于抽取构造方法中的共性代码。
3、 每次调用构造方法前都会调用构造代码块new
4、 优先于构造方法加载
5、 测试

局部代码块
1、在方法里面的代码块；
2、通常用于控制变量的作用范围，除了括号就失效
3、变量的范围越小越好，成员变量有现成安全问题

****总结：代码块加载顺序****
1、创建对象时：
构造代码块->构造方法
构造代码块：每次创建对象前(调用构造方法前)执行
构造方法：创建对象时调用
2、方法调用时：
局部代码块：存在方法里，只有等着调用方法才执行
3、构造代码块->构造方法->局部代码块
*/
public class Test4_Block {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("小狗", "大黄",99);
        a1.show();
    }
}
//创建Animal类
class Animal{
    String kind;
    String name;
    int age;
    // 1.构造代码块:每次创建对象前都会执行
    // 2.顺序:先执行构造代码块,在执行构造方法
    {
        age = 0;
        System.out.println("小动物出生了，现在是:"+age+"岁");
        System.out.println("执行了构造代码块");
    }

    public Animal() {
        System.out.println("执行了构造方法");
    }

    public Animal(String kind, String name, int age) {
        this.kind = kind;
        this.name = name;
        this.age = age;
        System.out.println("执行了含参构造"+age);
    }
    public void show(){
        {
            int i = 10;// 作用范围就是附近的括号内
            System.out.println(i);
            System.out.println("局部代码块");
        }
        //System.out.println(i);报错，超出使用范围
    }
}

