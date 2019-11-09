package cn.tedu.dataStructure;

import java.util.Stack;

public class Test3_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 入栈
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        // 出栈
        System.out.println("原来元素个数:" + stack.size());
        while (!stack.isEmpty()){
            System.out.println("出栈的元素: "+stack.pop() + " | 使用pop()出栈后元素个数: " + stack.size());
        }
    }
}
