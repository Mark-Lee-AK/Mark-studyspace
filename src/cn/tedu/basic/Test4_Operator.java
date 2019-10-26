package cn.tedu.basic;

/*通常boolean值 true和false表示真和假，用1表示真用0表示假
& ： 与表示的是并且的关系
    1 & 2 想要得到true，要求1和2都得是true
    &&： 双与/短路与
    1 && 2 当1的结果为false时，2会被短路，提高效率
| ： 或表示的是或者的关系
    1  |  2 想要得到true，要求1和2中只有一个true就可以
    || ：双或/短路或
    1  ||  2 当1的结果为true时，2会被短路，提高效率*/

public class Test4_Operator {
    public static void main(String[] args) {
        //符号在前，先变化后使用
        //符号在后，先使用在变化
        int a = 1;
        System.out.println(a++);

        int b = 1;
        System.out.println(++b);

        int c = 1;
        System.out.println(c--);

        int d = 1;
        System.out.println(--c);

        System.out.println(++a-b+c--);
    }
}
