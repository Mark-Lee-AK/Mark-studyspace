package cn.tedu.exception;

import org.junit.Test;

public class Test1_TestError {
    @Test
    public void test() {
        //ArithmeticException:/ bye zero
        try {
            // 用try/catch处理异常
            int i = 3/0;
            System.out.println(i);
        } catch (Exception e){
            System.out.println("出错啦~");
        }
    }
}
