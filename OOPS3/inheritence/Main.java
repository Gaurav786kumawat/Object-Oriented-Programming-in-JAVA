package inheritence;

// import javax.swing.Box;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(3,4,5);
        // Box box2 = new Box(box);
        // System.out.println(box.l + " " + box.w + " " + box.h);
        // System.out.println(box2.l + " " + box2.w + " " + box2.h);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,5);
        // System.out.println(box3.h + " " + box3.weight);


        // Box box5 = new BoxWeight(2,3,4,5);
        // System.out.println(box5.w);

        // there are many variables in both parent and child classes 
        // you are given access to variables that are in the ref types i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means , that the ones you are trying to access should be initialised 
        // but here , when the obj itself is of type parent class, how will you call the class 
        // this is why error

        // BoxWeight box6 = new Box(2,3,4);
        // System.out.println(box6);


        // ! 


        // BoxPrice box = new BoxPrice(3,4,5);

    }
}


