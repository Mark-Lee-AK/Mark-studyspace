package cn.tedu.exception;

public class Test3_Finally {
    public static void main(String[] args) {
        try { //try里面的代码必须执行
            String name = "tony";
            String name2 = "Mark";
            System.out.println(name);
            int i = 3/0;//抛出异常
            System.out.println(name2);//不再执行
        } catch (Exception e){ //只有出现异常才执行
            System.err.println(e.getMessage());
        }finally { //死活都执行，对复杂对象释放资源
            System.out.println("finally内的代码");
        }
    }
}