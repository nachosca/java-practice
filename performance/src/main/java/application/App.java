package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long mill;
        long delta;
        // beginning

        mill = System.nanoTime();
        Helper.addElementsToBeginning(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToBeginning(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);



        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        mill = System.nanoTime();
        Helper.addElementsToBeginning(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToBeginning(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.addElementsToBeginning(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToBeginning(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);



        // middle

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.addElementsToMiddle(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToMiddle(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.addElementsToMiddle(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToMiddle(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.addElementsToMiddle(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToMiddle(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        // end

        mill = System.nanoTime();
        Helper.addElementsToEnd(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToEnd(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }



        mill = System.nanoTime();
        Helper.addElementsToEnd(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToEnd(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.addElementsToEnd(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.addElementsToEnd(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }



        //DELETION



        System.out.println("remove");
        // beginning

        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);



        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromBeginning(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);



        // middle

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromMiddle(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        // end

        mill = System.nanoTime();
        Helper.removeElementsFromEnd(arrayList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromEnd(linkedList, 100);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }



        mill = System.nanoTime();
        Helper.removeElementsFromEnd(arrayList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromEnd(linkedList, 10000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);


        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        mill = System.nanoTime();
        Helper.removeElementsFromEnd(arrayList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        mill = System.nanoTime();
        Helper.removeElementsFromEnd(linkedList, 100000);
        delta = (System.nanoTime() - mill) / 10000;
        System.out.println(delta);

        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


    }
}
