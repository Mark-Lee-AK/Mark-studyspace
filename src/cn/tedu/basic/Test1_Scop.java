package cn.tedu.basic;

//测试基本类型的取值范围
public class Test1_Scop {
    // 快捷键 psvm -> enter
    public static void main(String[] args) {
        /*整形  byte short int long*/
        // 三要素 ：变量类型 变量名 = 变量值

        // byte型
        byte maxb = Byte.MAX_VALUE;
        byte minb = Byte.MIN_VALUE;
        System.out.println("byte的最大值：" + maxb);
        System.out.println("byte的最小值：" + minb);

        // short型
        short maxs = Short.MAX_VALUE;
        short mins = Short.MIN_VALUE;
        System.out.println("short的最大值：" + maxs);
        System.out.println("short的最小值：" + mins);

        // int型
        int maxi = Integer.MAX_VALUE;
        int mini = Integer.MIN_VALUE;
        System.out.println("int的最大值：" + maxi);
        System.out.println("int的最小值：" + mini);

        // long型
        long maxl = Long.MAX_VALUE;
        long minl = Long.MIN_VALUE;
        System.out.println("byte的最大值：" + maxl);
        System.out.println("byte的最小值：" + minl);

        /*浮点型 float double*/
        //float
        float maxf = Float.MAX_VALUE;
        float minf = Float.MIN_VALUE;
        System.out.println("float的最大值是" + maxf);
        System.out.println("float的最小值是" + minf);

        //double
        double maxValue = Double.MAX_VALUE;
        double minValue = Double.MIN_VALUE;
        System.out.println("float的最大值是" + maxValue);
        System.out.println("float的最小值是" + minValue);
    }
}
