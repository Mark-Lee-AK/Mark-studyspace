package cn.tedu.api;

public class Test1_Object {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        System.out.println(stu1);
        System.out.println(stu1.toString());

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu1.equals(stu2));
    }
}
// 创建Student类
class Student extends Object{
    // 提供私有属性
    private String name;
    private int age;

    // 提供公共的get()/set()
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

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}