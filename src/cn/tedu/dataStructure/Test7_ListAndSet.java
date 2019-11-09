package cn.tedu.dataStructure;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test7_ListAndSet {
    @Test
    public void list(){
        ArrayList<String> aList = new ArrayList<>();

        // 存储可重
        aList.add("郭靖");
        aList.add("郭靖");
        aList.add("杨过");
        aList.add("张无忌");
        System.out.println("------- 验证List可重 -------");
        for (String s :
                aList) {
            System.out.println(s);
        }

        System.out.println("------- 验证List有序 -------");
        // 顺序
        for (int i = 0; i < 5; i++) {
            aList.add(i+"");
        }

        for (String s :
                aList) {
            System.out.println(s);
        }
    }

    @Test
    public void Set(){
        Set<String> hSet = new HashSet<String>();
        // 存储不可重
        hSet.add("黄蓉");
        hSet.add("小龙女");
        hSet.add("赵敏");
        hSet.add("黄蓉");
        System.out.println("------- 验证Set不可重 -------");
        for (String s :
                hSet) {
            System.out.println(s);
        }
        System.out.println("------- 验证Set无序 -------");
        // 无序
        for (int i = 0; i < 5; i++) {
            hSet.add(i+"");
        }

        for (String s :
                hSet) {
            System.out.println(s);
        }
    }
}
