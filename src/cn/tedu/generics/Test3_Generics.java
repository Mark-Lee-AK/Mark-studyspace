package cn.tedu.data;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test3_Generics {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        // 1.编译器泛型检查,类型报错,这是在编译阶段
        //list.add("mark");

        // 2.但在实际运行时,泛型的地方就被代替会通用类型Object
        Class<?> clazz = list.getClass();
        Method m = clazz.getDeclaredMethod("add", Object.class);

        // 3.利用映射得到的对象是运行时对象,其就可以设置非整形的数据
        m.invoke(list,"mark");
        m.invoke(list,"123");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
