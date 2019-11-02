package cn.tedu.IO;

import java.io.*;

// 测试文件的读取
public class Test3_IN {
    public static void main(String[] args) throws IOException {
        // 观察读取效率
        method();//利用FileInputStream字节流读取
        method2();//利用BufferedInputStream字节流读取
        method3();//利用BufferedReader字节流读取
    }

    // BufferedReader字符流读取数据
    private static void method3() throws IOException {
        Reader in = new BufferedReader(new
                InputStreamReader(new
                FileInputStream("E:\\Mark\\1688.pdf")));
        long start = System.currentTimeMillis();
        int b = 0;
        while ((b = in.read()) != -1) {
            //System.out.println(b);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("BufferedReader字符流读取数据耗时:" + end + "ms");
    }

    // BufferedInputStream读取数据
    private static void method2() throws IOException {
        // 创建对象
        InputStream in = new BufferedInputStream(new FileInputStream("E:\\Mark\\1688.pdf"));
        //开始读取
        int b = 0; //记录读取到的数据
        long start = System.currentTimeMillis();
        while ((b = in.read()) != -1) {
            // System.out.println(b);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("BufferedInputStream字节流读取数据耗时:" + end + "ms");
        //释放资源
        in.close();
    }

    // FileInputStream 读取数据
    private static void method() throws IOException {
        //创建字节流对象
        FileInputStream in = new FileInputStream("E:\\Mark\\1688.pdf");
        //开始读取
        long start = System.currentTimeMillis();
        int b = 0;//记录每次读到了哪个数据
        //每次读到文件末尾返回-1
        while ((b = in.read()) != -1) { //一个字节一个字节的读
            // System.out.println(b);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("FileInputStream字节流读取数据耗时:" + end + "ms");
        //释放资源
        in.close();
    }
}
