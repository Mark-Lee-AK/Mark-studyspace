package cn.tedu.IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// 测试File
public class Test1_File {
    public static void main(String[] args) throws IOException {
        // 创建File对象
        File f = new File("D:\\test\\1.txt");

        // 测试常用方法
        System.out.println("文件路径: "+f.getAbsolutePath());
        System.out.println("文件的字节量: "+f.length()+" byte");
        System.out.println("文件是否存在: " + f.exists());
        System.out.println("该文件是否为文件: " + f.isFile());
        System.out.println("该文件是否为文件夹: " + f.isDirectory());
        System.out.println("文件名是:"+ f.getName());
        System.out.println("父路径为: " + f.getParent());
        System.out.println();

        File f2 = new File("D:\\test\\2.txt");
        System.out.println(f2.createNewFile());
        System.out.println(f2.mkdir());
        System.out.println(f2.mkdirs());
        System.out.println(f2.delete());
        System.out.println();

        File f3 = new File("E:\\Mark");
        System.out.println(Arrays.toString(f3.list()));
        System.out.println(f3.listFiles());
    }
}
