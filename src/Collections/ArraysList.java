package src.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysList {
    public static void main(String[] args) {
        // list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
//        System.out.println(list);

        list.add(1,70);
//        System.out.println(list);

         list.clear();
//        System.out.println(list);


        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(0,60);
        linkedList.add(1,40);
        linkedList.clone();
        System.out.println(linkedList);

//        int a = linkedList.get(1);
//        System.out.println(a);





    }
}
