package cn.tedu.basic;

//数据间的转换
public class Test4_Convert {
    public static void main(String[] args) {
        //小char转大int
        //右侧的c是小char类型，给左侧的a大类型赋值
        //可以直接赋值
        char c = 97;
        int a = c;

        //右侧的b是long小类型，左侧的f是大类型
        //可以直接赋值
        long b = 10000;
        float f = b;

        //右侧int是大类型，左侧的short是小类型
        //需要强转
        int e = 21;
        short g = (short) e;

    }
}
