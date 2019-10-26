package cn.tedu.whiledemo;

import org.junit.Test;

public class Test2_WhileAndDoWhile {
    @Test
    public void test1(){
        System.out.println("while loop");
        int i = 0;
        int j = 0;
        while (i<10){
            System.out.print(i++);
        }
        while (j<0){
            System.out.print(i++);
        }
    }
    @Test
    public void test2(){
        System.out.println("do-while loop");
        int i = 0;
        int j = 0;
        do {
            System.out.print(i++);
        }while (i<10);
        System.out.println();
        do{
            System.out.print(j++);
        }while (j<0);
    }

}
