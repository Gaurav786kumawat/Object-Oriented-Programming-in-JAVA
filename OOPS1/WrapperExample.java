public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 12;
        // Integer num = 45;

        swap(a,b);
        System.out.println(a + "    " + b);
        

        // final int bonus = 3; // now we are unable to update bonus

        final A gaurav = new A ("Gaurav Kumawat");
        gaurav.name = "Other name";

        System.out.println(gaurav.name);

        // when a non primitive is final , you cannot reassign it.
        // gaurav = new A("new OBject"); <-- like this

    }

    static void swap (Integer a , Integer b){
        int temp = a ;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 3; //  final variable must be initialize while declaring it. 
    String name;

    public A(String name){
        this.name = "Gaurav KUmawat";
    }
} 





