package cn.tedu.OOP;

public class Test1_Person {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.id = "007";
        p1.name = "James Bond";

        System.out.println("They call him "+p1.name);
        System.out.println("by the way, CIA calls him "+p1.id);

        p1.kill();
        p1.work();

        System.out.println("--------------------------------");

        Person p2 = new Person();
        p2.id = "1688";
        p2.name = "Jack Ma";

        System.out.println(p2.name + " is the most rich man in china");
        System.out.println("he also builder the " + p2.id);
        p2.work();
    }
}
