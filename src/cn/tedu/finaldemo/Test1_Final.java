package cn.tedu.finaldemo;

public class Test1_Final {

    public static void main(String[] args) {
        son s = new son();
        s.eat();

    }
}
// 创建父类
// final class  papa{} 被final修饰的类不能被继承

class papa{
    final public void eat(){
        System.out.println("papa eatting");
    }
}

class son extends papa{
    final String name = "张三";
    // public void eat(){} 被fianl修饰IDE方法不能被重写
    public void sleep(){
        // name = "李四"; 被final修饰的变量是常量，不能被改变
        System.out.println("the son sleeping");
    }
}