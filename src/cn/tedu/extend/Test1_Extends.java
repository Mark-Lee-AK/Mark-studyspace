package cn.tedu.extend;
//继承:从已有的类中派生出新的类,不能选择性地继承,服用以前的代码非常简单
/*
1.通过extends关键字
2.相当于把父类复制了一份
3.只支持单继承
4.继承可以传递:爷 -> 父 -> 子
5.不能继承私有成员
6.继承多用于功能的修改,子类可以拥有父类的功能的同事,进行功能拓展
7.像是 is a 的关系
*/

public class Test1_Extends {
    public static void main(String[] args) {
        // 创建子类对象测试父类提供的功能
        son s = new son();
        s.age = 12;
        s.lv = "儿子";
        // s.name = "dddd"; 报错，无法继承私有属性

        s.sleep();
        s.eat();
    }
}
// 创建爷爷类
class yeye{
    String lv;
    public void sleep(){
        System.out.println("在睡觉");
    }
}

// 创建父类
class papa extends yeye {
    private String name;
    int age;
    public void eat(){
        System.out.println("在睡觉");
    }
}

// 创建子类
// 通过extends发生继承关系
class son extends papa{

}