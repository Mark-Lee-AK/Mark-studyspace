package cn.tedu.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class Test6_HashSet {
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();

        // 不能重复
        hSet.add("乔峰");
        hSet.add("虚竹");
        hSet.add("段誉");
        hSet.add("乔峰"); // 和上面的值相同,自动覆盖

        // 特点1.无重
        for (String s :
                hSet) {
            System.out.println(s);
        }

        // 特点2.无序
        for (int i = 0; i < 30; i++) {
            hSet.add(i+"");
        }
        for (String s :
                hSet) {
            System.out.println(s);
        }

    }
}
