package polymorphism;

public class Circle extends Shapes {
    // this will run when obj of circle is created 
    // hence it is overriding the parent method 
    // this is called annotation
    @Override
    void area (){
        System.out.println("Area is pie * r * r");
    }
}
