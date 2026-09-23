package LinkedLists;

import java.util.LinkedList;
public class LLCollectionframeworks {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        //Add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        

        System.out.println(ll);
        ll.add(2,90);
        //Remove
        // ll.removeFirst();
        // ll.removeLast();

        // ll.removeLastOccurrence(2);

        //Print
        System.out.println(ll);
    }
}
