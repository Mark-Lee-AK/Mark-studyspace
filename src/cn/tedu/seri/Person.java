package cn.tedu.seri;

import java.io.Serializable;

// 序列化:把Java对象转成Json保存到磁盘中 -> out 过程
// 要求:Serializable接口,是给这个类做一个标记
public class Person implements Serializable {
    // 实现接口后,生成一个唯一的id
    private static final long serialVersionUID = 1L;

    // 属性
    private String name;
    private int age;

    //构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //提供set和get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
