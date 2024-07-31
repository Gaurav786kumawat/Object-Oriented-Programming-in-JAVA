package staticExample;

// outside classes can't be static.
public class InnerClasses {
    static class Test{
        String name ;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Gaurav");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}




