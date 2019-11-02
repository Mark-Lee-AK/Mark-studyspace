package cn.tedu.prop;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 读取属性文件
public class Test1_Prop {
    //单元测试 Junit方法:void + 没有参数 + @Test
    @Test
    public void read() throws IOException {
        //1.指定属性文件位置,必须在src下
        //加载工作空间里bin目录下的资源文件
        InputStream in = Test1_Prop.class
                .getResourceAsStream("jdbc.properties");
        //2.加载属性文件Properties
        Properties prop = new Properties();
        prop.load(in);

        //3.分析数据
        //注意:如果报错NullPointerException,是因为使用了空对象的功能
        //每个对象是否为null
        String key1 = (String) prop.get("jdbc.driver");//向下转型,原来是object类型
        String key2 = (String) prop.get("jdbc.url");//向下转型,原来是object类型
        String key3 = (String) prop.get("jdbc.username");//向下转型,原来是object类型
        String key4 = (String) prop.get("jdbc.password");//向下转型,原来是object类型

        System.out.println("jdbc.driver : "+key1);
        System.out.println("jdbc.url : "+key2);
        System.out.println("jdbc.username : "+key3);
        System.out.println("jdbc.password : "+key4);
    }
}
