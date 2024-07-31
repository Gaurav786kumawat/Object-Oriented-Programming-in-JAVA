package staticExample;

public class Main {
    public static void main(String[] args) {
        Human gaurav = new Human(20, "Gaurav Kumawat", 12000, false);
        Human rahul = new Human(23, "Rahul Kumawat", 15000, true);
        Human shyam = new Human(23, "Shyam Kumawat", 15000, true);

        // System.out.println(gaurav.name);
        // System.out.println(rahul.name);
        // System.out.println(shyam.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        // greeting();
        fun();
    }

    // we know that something which is not static belongs to an object
    void greeting() {
        System.out.println("Hello World");
        fun();
    }

    // this is not dependent on objects
    static void fun() {
        Main obj = new Main(); // can use like this
        obj.greeting();
        // greeting(); // you can't use this because it requires an instance but the
        // function you are using in it . does not depend on the instances.
    }

    void fun2() {
        greeting();
    }
}
