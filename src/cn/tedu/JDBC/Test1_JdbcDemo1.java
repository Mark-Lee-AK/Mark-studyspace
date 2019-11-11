package cn.tedu.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* Jdbc的快速入门:
* 查询account表中的所有记录,输出到控制台
* */
public class Test1_JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.注册数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql:///jt_db?characterEncoding=utf-8",
                "root", "123");
        //3.获取传输器
        Statement stat = conn.createStatement();
        //4.发送SQL到服务器执行,返回执行结果
        String sql = "select * from account";
        ResultSet res = stat.executeQuery(sql);
        //5.处理结果
        while (res.next()){
            String id = res.getString("id");
            String name = res.getString("name");
            String money = res.getString("money");
            System.out.println(id+":"+name+":"+money);
        }
        //6.释放资源
        res.close();
        stat.close();
        conn.close();

        System.out.println("Test1_JdbcDemo1.main()");
    }
}
