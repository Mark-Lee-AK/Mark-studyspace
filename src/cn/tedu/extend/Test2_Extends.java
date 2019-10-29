package cn.tedu.extend;

public class Test2_Extends {
    public static void main(String[] args) {
        son2 son2 = new son2();
        son2.show();
        son2.eat();
    }
}
// 创建父类
class papa2{
    int sum = 30;

    public papa2() {
        System.out.println("执行父类的构造方法");
    }

    public void eat(){
        System.out.println("papa eating");
    }
}

// 创建子类
class son2 extends papa2{
    int sum = 10;

    public son2() {
        // super();// 默认省缺，自动执行
        System.out.println("执行子类构造方法");
    }

    // 修改父类原有的功能--方法重写
    // 重写要求:方法签名与父类完全一致
    // 重写后,并没有修改父类原来的功能,改的是子类自己的功能
    @Override
    public void eat() {
        System.out.println("the son is eatting");
    }

    // 子类特有的方法
    public void show(){
        int sum = 20;
        System.out.println("sum : "+sum);// 就近原则
        System.out.println("this.sum : "+this.sum);//this.调用的是成员变量
        System.out.println("super.sum : "+super.sum);//super.代表父类对象的引用
        super.eat();
    }
}