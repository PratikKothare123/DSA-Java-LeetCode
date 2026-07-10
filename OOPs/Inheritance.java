package OOPs;

public class Inheritance{
    public static void main(String[] args) {
        
        // Fish f = new Fish();
        // f.eat();
        // f.color= "Orange";
        // // System.out.println(f.color);


        Fish f = new Fish();
        f.swim();
        f.breath();

        Mammals m = new Mammals();
        m.leg=5;
        System.out.println(m.leg);



    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eat");
    }

    void breath(){
        System.out.println("They can breath");
    }
}


class Mammals extends Animal{
    int leg;
}
    
class Fish extends Mammals{
    int fins;

    void swim(){
        System.out.println("They can swim in water");
    }
}

