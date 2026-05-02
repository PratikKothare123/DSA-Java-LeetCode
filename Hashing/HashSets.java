package Hashing;
import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);

        System.out.println(set);

        if(set.contains(3)){
            System.out.println("Set contains 3");
        }
        if(set.contains(2)){
            System.out.println("Set 2 contains");
        }
    }
}
