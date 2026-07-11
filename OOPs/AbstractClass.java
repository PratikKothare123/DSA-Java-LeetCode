package OOPs;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.ChangeColor();
        // System.out.println(h.color);  // whenever w create of obj of child class 1st called go to the Super class/parent class

        h.ChangeColor();
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); //we cant create a obj of abstract class 

    }   
}

abstract class Animal{

    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();    // abstract methods dosent have their implementation, they dosent show, But thier implementation show their Subclass
}

class Horse extends Animal{

    void ChangeColor(){
        color = "Black";
    }
    void walk (){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{

    void ChangeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("Walk on 2 Leg");
    }
}