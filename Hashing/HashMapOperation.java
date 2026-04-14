package Hashing;
import java.util.*;
public class HashMapOperation {
    public static void main(String[] args) {

        //Create
        // HashMap<String,Integer> map = new HashMap<>();


        // //Insert - O(1)
        // map.put("India",100);
        // map.put("USA", 200);

        // System.out.println(map);

        //Get - O(1)
        
    //    int population =map.get("India");
    //    System.out.println(population); //100

    //    System.out.println(map.get("Japan")); //null Bcz, Not present in HashMap


    //    //    ContainsKey - O(1) It return Bollean True or False depends on key present in Hash Or Not

    //    System.out.println(map.containsKey("India")); //true
    //    System.out.println(map.containsKey("Pakistan")); //false

    //Remove - O(1) -> It removes the key and value both and return value if exist otherwise return NULL
        //   System.out.println(map.remove("USA")); //200 
        //   System.out.println(map);      {India=100} 

    //Size -> It return the size of map 
        //    System.out.println(map.size());


    //Is Empty
        //     map.clear();
        //    System.out.println(map.isEmpty()); //false



        HashMap<String,Integer> map = new HashMap<>();


        //Insert - O(1) 
        map.put("India",100);
        map.put("Chaina",150);
        map.put("US",50);
        map.put("indonesia",6); 
        map.put("Nepal", 5);

        //Iterate
        Set<String> keys = map.keySet(); 
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= "+k+",value="+map.get(k));
        }


    }
}
