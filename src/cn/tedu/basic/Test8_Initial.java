package cn.tedu.basic;

import org.junit.Test;

public class Test8_Initial {
    // 八种基本类型的初始值
    // 局部变量必须设置初始值，所以要用个成员变量
    boolean b;
    char c;
    byte bt;
    short s;
    int i;
    long l;
    float f;
    double d;

    @Test
    public void test(){
        System.out.println("boolean的初始值:"+b);
        System.out.println("char的初始值:"+c);
        System.out.println("byte的初始值:"+bt);
        System.out.println("short的初始值:"+s);
        System.out.println("int的初始值:"+i);
        System.out.println("long的初始值:"+l);
        System.out.println("float的初始值:"+f);
        System.out.println("double的初始值:"+d);
    }
}
