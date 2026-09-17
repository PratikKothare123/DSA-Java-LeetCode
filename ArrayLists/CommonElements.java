
import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(40);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(20);
        B.add(40);
        B.add(50);
        B.add(60);

        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {

            if (B.contains(A.get(i))) {
                common.add(A.get(i));
            }
        }

        System.out.println(common);
    }
}