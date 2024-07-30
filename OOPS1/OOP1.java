public class OOP1 {
    public static void main(String[] args) {

        Student st1 = new Student();
        // st1.rno = 5;
        // st1.name = "Gaurav";
        // st1.marks = 98.34f;

        System.out.println(st1.rno);
        System.out.println(st1.name);
        System.out.println(st1.marks);

        // st1.changeName("ShoeLover");
        // st1.greeting();
        
        Student st2 = new Student(45 , "Rahul Kumar" , 98.7f);
        System.out.println(st2.rno);
        System.out.println(st2.name);
        System.out.println(st2.marks);

        // ! 
        Student random = new Student(st1);
        System.out.println(random.name);


    }


}

class Student{
    int rno;
    String name;
    float marks;

    void changeName (String newName){
        name = newName;
    }

    void greeting(){
        System.out.println("Hello My name is : " + this.name);
    }
    // we need a way to add the values of the above properties object by object 
    // we need one word to access every object.


    Student(){
        this.rno = 12;
        this.name = "Gaurav";
        this.marks = 89.34f;
    }

    // ! Correct way of initializing objects 
    // Student arpit = new Student(12,"Arpit", 45.3f);
    // her , this will be replaced with arpit 
    Student(int rollNo , String Name , float Marks){
        this.rno = rollNo;
        this.name = Name;
        this.marks = Marks;
    }
    // ! over of Correct way

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}
