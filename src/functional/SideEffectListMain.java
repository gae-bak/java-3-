package functional;

import java.util.ArrayList;
import java.util.List;

public class SideEffectListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        System.out.println("before list1 = " + list);
        changeList1(list);
        System.out.println("after list1 = " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");

        System.out.println("before list1 = " + list2);
        List<String> result = chageList2(list2);
        System.out.println("after list1 = " + list2);
        System.out.println(result);
    }

    private static List<String> chageList2(ArrayList<String> list2) {
        ArrayList<String> newList = new ArrayList<>();
        for (String s : list2) {
            newList.add(s + "_complete");
        }

        return newList;
    }

    private static void changeList1(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "_complete");
        }
    }


}
