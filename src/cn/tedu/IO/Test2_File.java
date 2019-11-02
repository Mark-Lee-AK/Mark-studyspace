package cn.tedu.IO;

import java.io.File;

//递归求文件总大小
public class Test2_File {
    public static void main(String[] args) {
        // 指定要递归求大小的目录/文件夹
        File dir = new File("E:\\Mark");
        // 调用method方法计算
        long total = method(dir);
        System.out.println("该文件夹的总大小为: " + total);
    }
    //计算目录大小
    private static long method(File dir) {
        //把dir目录的所有资源列出来
        File[] fs = dir.listFiles();

        //记录文件大小
        long size = 0;

        //遍历每个资源fs[i]
        for (int i = 0; i < fs.length; i++) {
            if (fs[i].isFile()) { // 判断是不是文件
                size += fs[i].length();//每个文件的大小求和
                System.out.println(fs[i].getName());
            }else if (fs[i].isDirectory()){//判断是不是文件夹
                //重复:继续列表,是文件就求和,不是就继续遍历文件夹...
                System.out.println("【打开文件夹】"+fs[i].getName()
                );
                size += method(fs[i]);//获取内部文件夹的大小
            }
        }
        return size;
    }
}
