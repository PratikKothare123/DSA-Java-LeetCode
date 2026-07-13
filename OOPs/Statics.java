package OOPs;

public class Statics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchollName = "SBJIT";
        // System.out.println(s1.SchollName);

        Student s2 = new Student();
        System.out.println(s2.SchollName); // SBJIT     not occur error, Bcz. School name is Static, we can use evey where eithou creating new objectect 
    }
}

class Student{
    int roll;
    String name;
    static String SchollName;    // does not create memory for each object, created Once

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
