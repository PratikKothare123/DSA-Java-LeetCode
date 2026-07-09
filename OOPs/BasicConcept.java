package OOPs;

public class BasicConcept {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // object for Pen 
        // p1.setColor("Red"); 
        // System.out.println(p1.color);


        Student s1 = new Student();
        s1.driveBike("Pratik",19);
    }
}

class Pen{            // Class Pen 

    String color;    // attributes, properties
    int tip;

    void setColor(String newColor){     // Functions i,e Behaviour
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}


class Student{
    String name;
    int age;

    void driveBike(String name,int age){
        if(age>18){
            System.out.println(name+" You can Drive Bike");
        }else{
            System.out.println("Don't Drive ");
        }
    }
}
