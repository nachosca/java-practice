package application;

import java.util.List;

public class Helper {


    public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd){
        for (int i = 0; i < numberOfElementsToAdd ; i++) {
            list.add(0, i);
        }
    }

    public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd){
        for (int i = 0; i < numberOfElementsToAdd ; i++) {
            list.add(list.size()/2, i);
        }
    }

    public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd){
        for (int i = 0; i < numberOfElementsToAdd ; i++) {
            list.add(list.size(), i);
        }
    }

    public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove){
        for (int i = 0; i < numberOfElementsToRemove ; i++) {
            list.remove(0);
        }
    }

    public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove){
        for (int i = 0; i < numberOfElementsToRemove ; i++) {
            list.remove(list.size()/2);
        }
    }

    public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove){
        for (int i = 0; i < numberOfElementsToRemove ; i++) {
            list.remove(list.size() - 1);
        }
    }

}
