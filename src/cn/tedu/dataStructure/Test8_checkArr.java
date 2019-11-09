package cn.tedu.dataStructure;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test8_checkArr {
    public static void main(String[] args) throws Exception {
        int capacityCount = 0;//扩容次数
        int oldCapacity = 0;//记录就得容量值

        ArrayList<Integer> aList = new ArrayList<>();

        // 20个数据,初始容量大小10,扩容3次:10,16,22,每次扩容1.5倍
        int dataCount = 200;
        for (int i = 0; i < dataCount; i++) {
            aList.add(i);
            int capacity = Test8_checkArr.getCapacity(aList);
            // 新旧对比,判断变化
            if (oldCapacity != capacity){
                System.out.println("扩容啦!");
                oldCapacity = capacity;
                capacityCount++;
            }
        }
        System.out.println("扩容次数: " + capacityCount);
        System.out.println("记录总数: " + dataCount);

        System.out.println("验证");
        int val = 10; // 容器初始化值
        for (int i = 0; i <capacityCount ; i++) {
            System.out.println(val);
            val *=1.5; //扩容算法
        }

    }
    //ArrayList没有对外暴露当前存储的数组的长度
    //利用反射访问属性获取属性的长度
    private static int getCapacity(List<?> aList) throws Exception {
        Class<?> clazz = aList.getClass();
        Field f = clazz.getDeclaredField("elementData");
        f.setAccessible(true);

        Object[] o = (Object[])f.get(aList);
        return o.length;
    }
}
