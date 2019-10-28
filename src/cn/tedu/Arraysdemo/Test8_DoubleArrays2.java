package cn.tedu.Arraysdemo;

public class Test8_DoubleArrays2 {
    public static void main(String[] args) {
        char[][] a = {                                        // i
                {'我', '是', '一', '名', '程', '序', '员'},    // 0
                {'爱', '上', '编', '程', '写', '代', '码'},    // 1
                {'达', '到', '高', '薪', '不', '是', '梦'},    // 2
                {'内', '功', '修', '炼', '步', '步', '高'},    // 3
        }; // j   0     1     2     3     4    5     6
        System.out.println("第一维元素个数:" + a.length);
        System.out.println("第二维元素个数:" + a[0].length);

        // 顺序输出
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        // 藏头诗
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][0]);
        }
    }
}
