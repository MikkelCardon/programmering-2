package opgave04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(15, 0, -23, 42, 101, Integer.MIN_VALUE, 202, 0, -3));
        System.out.println(mergeSort(integers));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        return mergeSort(list, 0, list.size()-1);
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left == right) {
            return new ArrayList<>(List.of(list.get(left)));
        }

        int mid = left + (right - left) / 2;

        // Corrected sublist calls to include all elements properly
        ArrayList<Integer> list1 = mergeSort(list, left, mid);
        ArrayList<Integer> list2 = mergeSort(list, mid + 1, right);

        return merge(list1, list2);
    }

    //new ArrayList<>(list.subList(0, mid))

    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < list1.size() && index2 < list2.size()){
            if (list1.get(index1) <= list2.get(index2)){
                newList.add(list1.get(index1));
                index1++;
            }
            else {
                newList.add(list2.get(index2));
                index2++;
            }
        }
        while(index1 < list1.size()){
            newList.add(list1.get(index1));
            index1++;
        }
        while(index2 < list2.size()){
            newList.add(list2.get(index2));
            index2++;
        }

        return newList;
    }

}
