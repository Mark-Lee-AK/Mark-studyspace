package cn.tedu.staticdemo;
// 测试static的调用关系
// 静态只能调用静态,非静态啥都能调用!!!
public class Test2_Static {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.eat();
        System.out.println("------------------------");
        Student.study();
    }
}
// 创建学生类
class Student{
    // 普通资源
    String name;
    public void eat(){
        System.out.println(name);
        System.out.println("吃啥吃，就知道吃吃吃吃");
        study();//非静态方法可以调用静态方法
        this.country = "中国";//非静态方法可以调用静态属性
        System.out.println(country);
    }

    // 静态资源
    static String country;
    static public void study(){
        // 静态方法不能调用非静态资源
        // eat();
        // this.name = "mark";
        System.out.println("静态方法打印country : " + country);
        System.out.println("静态方法打印study()");
    }

}