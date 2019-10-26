package cn.tedu.Arraysdemo;
/*
	数组一旦创建，长度不可变
	数组元素都为同一类型，可以理解为存储一组数据的容器
	数组可以通过下标按顺序访问，下标从0开始，最大下标 a.length - 1
	允许0长度的数组 String[] s = new String[0];
	内存空间连续分配，顺序遍历性能高，但新增、删除数据繁琐，性能低
*/
public class Test1_ArraysBuild {
    public static void main(String[] args) {
        //声明数组
        int[] scores = new int[10];
        // int scores2[] = new int[10]; // 也可以这样声明
//        int[] scores = {1,2,3,4};// 也可以直接初始化
//        int [] scores = new int[]{1,2,3,4,5}//正规写法
        // 初始化数组
        for (int i = 0; i < 10; i++) {
            scores[i] = i * 10;
        }
        //遍历数据打印数组每个元素
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 反向遍历
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(scores[i]);
        }
    }
}
