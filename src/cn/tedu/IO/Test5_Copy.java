package cn.tedu.IO;

import java.io.*;

public class Test5_Copy {
    public static void main(String[] args) throws IOException {
        copy();//实现文件的复制
    }

    private static void copy() throws IOException {
        // 创建from文件
        File from = new File("E:\\Mark\\20191031\\from.txt");

        // 创建输入字节流,读取源文件
        InputStream in = new BufferedInputStream(new FileInputStream(from));

        // 创建to文件
        File to = new File("E:\\Mark\\20191031\\to.txt");
        // 创建写入字节流,写入数据
        OutputStream out = new BufferedOutputStream(new FileOutputStream(to));

        //边度便携
       /*
        //单字节读写
        int b = 0;
        while ((b=in.read())!=-1){
            out.write(b);
        }*/
        int b = 0;
        // 缓存要操作的数据,底层远吗一般设置的数组大小默认为8mb
        byte[] bs = new byte[8*1024];
        while ((b = in.read(bs))!=-1){ //按照数组批量读取
            out.write(bs); //按照数组批量写出
        }
        // 关闭资源
        in.close();
        out.close();
    }
}
