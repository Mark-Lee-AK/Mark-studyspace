package cn.tedu.whiledemo;

import java.util.Scanner;

/*拓展：高并发时注意
while（num==0）{ break; }
如果并发控制没有处理好，容易产生等值判断被“击穿”的情况，
使用大于或小于的区间判断条件来代替。
while (num<=0) { break; }*/

public class Test1_While {
    public static void main(String[] args) {
        //这是死循环，可以一致获得控制台的数据
        while (true) {
            String str = new Scanner(System.in).nextLine();
            // 利用判断判断条件退出死循环
            if (str.equals("exit")) break;

            // 遍历获取用户输入的内容
            for (int i = 0; i < str.length(); i++) {
                // charAt() 方法用于返回指定索引处的字符
                char c = str.charAt(i);
                if (c <= '9' && c >= '0') {
                    // 如果是数字就输出
                    System.out.print(c);
                } else {
                    // 否则就变成*打印出来
                    System.out.print("*");
                }
            }

        }
    }

}
