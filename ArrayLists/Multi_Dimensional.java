package ArrayLists;

import java.util.ArrayList;

public class Multi_Dimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(2*i);
            list3.add(3*i);
        }

        // list1.add(1);
        // list1.add(2);
        // list1.add(3);


        // list2.add(4);
        // list2.add(5);
        // list2.add(6);
        // list2.add(8);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing Main List
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> temp = mainList.get(i);
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
            // 1 2 3 4 5 
            // 2 4 6 8 10 
            // 3 6 9 12 15 

        System.out.println(mainList);  //[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]

    }
}
