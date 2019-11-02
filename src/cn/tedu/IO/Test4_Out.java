package cn.tedu.IO;

import java.io.*;

//测试字节写出流
public class Test4_Out {
    public static void main(String[] args) throws IOException {
        method();//FileOutputStream字节流输出
        method2();//BufferedOutputStream字节流输出,高效
        method3();//BufferedWriter字符流输出
    }
    // 利用BufferedWriter字节输出流写数据
    private static void method3() throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Mark\\out3.txt")));
        // 开始写入
        out.write(97);
        out.write(98);
        out.write(99);
        // 关闭资源
        out.close();
    }
    // 利用BufferedOutputStream字节输出流写数据
    private static void method2() throws IOException {
        // 创建输出流对象
        OutputStream out = new BufferedOutputStream(new FileOutputStream("E:\\Mark\\out2.txt"));
        // 开始写入
        out.write(97);
        out.write(98);
        out.write(99);
        // 关闭资源
        out.close();
    }

    // 利用FileOutputStream字节输出流写数据
    private static void method() throws IOException {
        // 创建输出流对象
        OutputStream out = new FileOutputStream("E:\\Mark\\out1.txt");

        // 开始写入
        out.write(97);
        out.write(98);
        out.write(99);

        // 释放资源
        out.close();
    }
}
