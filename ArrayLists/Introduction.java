package ArrayLists;
import java.util.ArrayList;

// ArrayList is a resizable array provided by Java's Collection Framework. 
// // Unlike a normal array, its size can grow or shrink dynamically
public class Introduction {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();


        //ArrayList<DataType> listName = new ArrayList<>();


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Boolean> status = new ArrayList<>();


        //Add Operation O(1)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        numbers.add(2,50);

        System.out.println(numbers);

        // //Get Operation O(1)
        // int element = numbers.get(1);
        // System.out.println(element);

        // //Delete O(n)
        // numbers.remove(2);
        // System.out.println(numbers); //[10, 20]

        //Set Operation  O(n)
        numbers.set(2, 80);  //[10, 20, 30]
         System.out.println(numbers);  //[10, 20, 80]


         // Contains Operation 
         System.out.println(numbers.contains(20));  //true
         System.out.println(numbers.contains(100));  //false

        names.add("Pratik");
        names.add("Sakshi");
        names.add("Harsha");

        System.out.println(names);

        status.add(true);
        status.add(false);
        status.add(true);

        System.out.println(status);

        // Size Operation 

        System.out.println(numbers.size());  //4 

        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+ " ");
        }
    }
}
