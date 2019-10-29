package cn.tedu.staticdemo;

// static 是java中的一个关键字，用于修饰成员变量和成员方法
/*
1.随着类的加载而加载
2.之家在一次,就会一直存在,直到类消失就一起消失
3.优先于对象的加载
4.被所有对象锁共享
5.可以直接被类名调用
*/

public class Test1_Static {
    public static void main(String[] args) {
        // 优先于对象加载,可以被类名直接调用
        System.out.println("1.Person.country = " + Person.country);

        Person p1 = new Person();
        p1.country = "England";
        System.out.println("2.Person.country = "+Person.country);
        Person p2 = new Person();
        // 静态资源是共享的，每个对象都能访问
        System.out.println("3.p2.country = " + p2.country);
    }
}

// builder the class call Person
class Person {
    static String country = "China";
}