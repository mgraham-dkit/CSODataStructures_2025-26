package introducing_classes.apps;

import utils.DynamicArray;

import java.util.ArrayList;

public class TestDynamicArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int [] sourceInfo = {1, 2, 3, 4, 5, 6};
        DynamicArray myList = new DynamicArray();

        for(int num: sourceInfo){
            myList.add(num);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + ", ");
        }

        System.out.println();

        while(myList.size() > 0){
            System.out.println("Removed: " + myList.remove(0));
        }

        System.out.println("Final list size: " + myList.size());
    }
}
