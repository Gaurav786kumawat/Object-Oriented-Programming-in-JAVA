package inheritence;

// import java.lang.reflect.Constructor;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
        // this.l; // can't able to use bcoz its private.
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side ,double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // what is this? -> Call the parent class constructor
        // used to initialise values present in the parent class
        this.weight = weight;
    }
}


