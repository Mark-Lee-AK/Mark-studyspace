package cn.tedu.constructor;

public class Test1_Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("白糖");
        p1.setAge(22);
        p1.setSex('男');
        System.out.println(p1);

        Person p2 = new Person("不求人", 28, '男');
        System.out.println(p2);
    }
}
// 创建人类
class Person{
    //构造方法:修饰符 类名([参数列表]){ },不写时会提供默认的无参构造
    //作用1:创建对象new Person()时自动调用
    //如果只提供含参构造时,会自动覆盖无参构造

    private String name;
    private int age;
    private char sex;

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}