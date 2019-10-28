package cn.tedu.OOP;

public class Test2_Student {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(2019, "张学友","唱歌");
        s1.name = "刘德华";
        s1.subject = "拍戏";
        s1.setSno(2018);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getSno());
        // s1.study(); 私有方法，无法调用
        s1.show();// 可以通过私有方法调用
    }
}

class Student{
    //提供私有属性
    private int sno;
    //提供公有属性
    String name;
    String subject;

    public Student() {
        System.out.println("用无参构造实例化对象");
    }

    public Student(int sno, String name, String subject) {
        this.sno = sno;
        this.name = name;
        this.subject = subject;
    }

    // 提供getXXX()方法,获取属性值
    public int getSno() {
        return sno;
    }

    // 提供setXXX()方法，设置属性值
    public void setSno(int sno) {
        this.sno = sno;
    }

    public void show(){
        study();
    }

    private void study(){
        System.out.println(name+"正在学习");
    }

    @Override //重写 toString()方法
    public String toString() {
        return "学生{" +
                "姓名=" + name +
                ",学号=" + sno +
                ", 学科=" + subject +
                '}';
    }
}