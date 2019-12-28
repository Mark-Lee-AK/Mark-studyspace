package cn.tedu.inner;

/**
 * Create by Mark Lee
 * 2019/12/28 15:52
 */
public class Test2_inner {
    public static void main(String[] args) {
        Weapon w1 = f1();
        w1.kill();
        System.out.println(w1);

        Weapon w2 = f2("屠龙刀");
    }

    private static Weapon f2(String name) {
        /**
         * 匿名内部类
         * {}           - 匿名类
         * new          - 新建匿名类的实例
         * Weapon       - 父类型，父类或父类接口都可以
         * ()           - super() 调用父类构造方法，可以调有参构造
         */
        Weapon w = new Weapon(){
            @Override
            public void kill() {
                System.out.println("使用"+name+"发起进攻");
            }
        };
        return w;
    }

    private static Weapon f1() {
        // 局部内部类
        class AK47 implements Weapon{
            @Override
            public void kill() {
                System.out.println("使用ak47进攻");
            }
        }
        AK47 a = new AK47();
        return a;
    }
}
