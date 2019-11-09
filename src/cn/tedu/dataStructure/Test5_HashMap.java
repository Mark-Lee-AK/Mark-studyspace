package cn.tedu.dataStructure;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

public class Test5_HashMap {
    @Test
    public void hashMapKV() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("java就业班", "助攻java,带学员入行");
        map.put("java培优班", "主攻互联网架构，带学员开发大型核心业务");
        map.put("java才高班", "主攻大数据分析，带学员进入海量数据处理");
        map.put("java高手班", "主攻技术底层，知其然知其所以然");

        System.out.println("通过键获取值: " + map.get("java高手班"));
        System.out.println();
        System.out.println("变量HashMap所有键:");
        // 创建迭代器实例
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.print(key + " : ");

            String value = map.get(key);
            System.out.println(value);
        }
    }
}
