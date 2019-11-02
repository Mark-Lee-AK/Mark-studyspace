package cn.tedu.IO;

import java.io.UnsupportedEncodingException;

// 测试编码方式
public class Test6_Code {
    public static void main(String[] args) throws Exception {
        String str = "我爱你中国";
        System.out.println("utf-8: "+str.getBytes("utf-8").length);
        System.out.println("gbk: "+str.getBytes("gbk").length);
    }
}