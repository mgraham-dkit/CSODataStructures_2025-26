package introducing_classes.apps;

import utils.DynamicArray;

public class TestDynamicArray {
    public static void main(String[] args) {
        int [] sourceInfo = {1, 2, 3, 4, 5, 6};
        DynamicArray myList = new DynamicArray();

        for(int num: sourceInfo){
            myList.add(num);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + ", ");
        }

        System.out.println();

        DynamicArray secondList = new DynamicArray();
        for(int num: sourceInfo){
            secondList.add(num*2);
        }

        myList.join(secondList);
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
