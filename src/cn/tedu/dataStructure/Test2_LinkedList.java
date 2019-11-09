package cn.tedu.dataStructure;

import java.util.LinkedList;

public class Test2_LinkedList {
    /*
     * <>泛型
     * 在集合语法中,用来限制集合中添加的数据类型
     * 泛型和集合,都不支持基本类型,只能用包装类型
     * */
    public static void main(String[] args) {

        LinkedList<String> frames = new LinkedList<String>();
        // 向尾部添加数据
        frames.add("springmvc 表层框架");
        frames.add("spring 业务框架");
        frames.add("mybatis 持久层框架");
        System.out.println("--------- 初始化后的链表数据顺序 --------");
        for (String s :
                frames) {
            System.out.println(s);
        }

        System.out.println("获取第一个元素: " + frames.get(0) + "|" + frames.getFirst());
        System.out.println("获取最后一个元素: " + frames.get(frames.size() - 1) + "|" + frames.getLast());

        System.out.println("--------- 分别向头部和尾部添加元素 --------");
        frames.addFirst("三大框架");
        frames.addLast("微服务");
        for (String s :
                frames) {
            System.out.println(s);
        }

        System.out.println("--------- 删除数据 --------");
        System.out.println("删除第一个元素: " + frames.removeFirst());
        for (String s :
                frames) {
            System.out.println(s);
        }
        System.out.println("删除指定位置元素: " + frames.remove(2));
        for (String s :
                frames) {
            System.out.println(s);
        }
        System.out.println("删除指定元素: " + frames.remove("微服务"));
        for (String s :
                frames) {
            System.out.println(s);
        }
    }
}
