package cn.tedu.enumdemo;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

public class Test_Enum {
    @Test
    public void oldSeason(){
        System.out.println(OldSeason.SUMMER);
    }

    @Test
    public void newSeason(){
        System.out.println(Season.SUMMER);

        // 顺序的整数值，默认从0开始
        System.out.println(Season.SUMMER.ordinal());
    }

    // 了解一下自定义注解中的枚举
    @Test
    public void testEnum(){
        System.out.println(ElementType.TYPE);
        System.out.println(ElementType.METHOD);
        System.out.println(ElementType.FIELD);
        System.out.println(RetentionPolicy.RUNTIME);
    }
}
