package cn.tedu.dataStructure;

import java.util.ArrayList;

public class Test1_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        System.out.println(alist.size());

        alist.add("路飞");// 新增元素
        alist.add("索隆");
        alist.add("山治");
        alist.add("娜美");
        alist.add("乌索普");
        alist.add("妮可罗宾");
        alist.add("乔巴");
        alist.add("弗兰奇");
        alist.add("布鲁克");
        alist.add("甚平");

        alist.remove(4);
        System.out.println("草帽一伙还剩下多少人? "+ alist.size());

        for (String str :alist) {
            System.out.print(str+" ");
        }
        System.out.println();
        ArrayList<String> blist = new ArrayList<>();
        blist.add(0,"张学友");
        blist.add(0,"刘德华");
        blist.add(0,"黎明");
        blist.add(0,"郭富城");


        for (String str : blist) {
            System.out.println(str);
        }
        System.out.println(blist.get(0));
        blist.set(0,"梁朝伟");
        System.out.println(blist.get(0));

        ArrayList<String> clist = new ArrayList<>();
        clist.add("秦穆公");
        clist.add("楚庄王");
        for (String s :
                clist) {
            System.out.println(s);
        }

    }
}
