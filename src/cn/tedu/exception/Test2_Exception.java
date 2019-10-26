package cn.tedu.exception;

import org.junit.Test;
/*
谁调用，谁解决。
分成两步：
1、抛异常: throw new Excepeiton("")
2、接异常: throws Exception
*/
public class Test2_Exception {
    @Test
    public void test() throws Exception {
        // 主动制造异常
        // 模拟输入密码不正确而往上抛出异常
        try {
            String password = "123456";
            if (!"admin".equals(password)) {
                //主动抛出错误
                throw new Exception("password error.");
            }
        } catch (Exception e) {
            // 主动抛出错误
            System.out.println(e.getMessage());
            throw new Exception("密码错误！");
        }
        // 完美体现流程控制

        //僵尸代码,不可能执行Unreachable code
        System.out.println("完成了");
    }
}
