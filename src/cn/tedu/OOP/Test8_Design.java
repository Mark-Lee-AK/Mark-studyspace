package cn.tedu.OOP;

/*
具体事物：培优班老师CgbTeacher，高手班老师ActTeacher
共性：备课ready()，讲课teach()，休息rest()
创建多态对象测试
*/
// 面向抽象编程
public class Test8_Design {
    public static void main(String[] args) {
        Teacher cgb = new CgbTeacher();
        Teacher act = new ActTeacher();
        cgb.ready();
        cgb.teach();
        cgb.rest();
        System.out.println("--------------------------");
        act.ready();
        act.teach();
        act.rest();
    }
}

//1.把共性向上提取，形成父类
//2.普通父类还是抽象父类？由于方法体的实现不一样，所以提供抽象父类
abstract class Teacher{
    // 抽象方法：子类实现都不一样
    abstract public void ready();
    abstract public void teach();

    // 普通方法:方法体每个子类都是 一样
    public void rest(){
        System.out.println("周末休息");
    }
}

// 继承了抽象父类,需要重写父类所有的抽象方法
class CgbTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("准备电商项目的课程");
    }

    @Override
    public void teach() {
        System.out.println("主讲电商项目");
    }
}

class ActTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("准备框架加强的课程");
    }

    @Override
    public void teach() {
        System.out.println("主讲框架加强的内容");
    }
}