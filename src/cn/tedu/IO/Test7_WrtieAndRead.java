package cn.tedu.IO;

import org.junit.Test;

import java.io.*;

public class Test7_WrtieAndRead {
    @Test
    public void write() throws Exception {
        File f = new File("D:/javabase.txt");
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(f), "utf-8"));
        String msg = "欢迎来到英雄联盟";
        bw.write(msg);
        bw.close();
    }

    @Test
    public void read() throws Exception {
        File f = new File("D:/javabase.txt");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(f),"utf-8"));
        String line="";
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
