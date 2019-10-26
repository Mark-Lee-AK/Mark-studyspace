package cn.tedu.BreakContinueReturn;

import org.junit.Test;
/*
	break是跳出循环
	continue是跳过此次循环，执行下一次运行
	return直接返回调用的main函数，后面的代码都不执行，所以不执行打印“执行完成”的语句
*/
public class Test1 {
    @Test
    public void testContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        System.out.println("执行完成");
    }
    @Test
    public void testBreak(){
        for (int i = 0; i < 10; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }
        System.out.println("执行完成");
    }
    @Test
    public void testReturn(){
        for (int i = 0; i < 10; i++) {
            if (i == 3) return;
            System.out.print(i + " ");
        }
        System.out.println("执行完成");// 不执行，因为return返回main函数
    }
}
