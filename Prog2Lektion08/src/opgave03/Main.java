package opgave03;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Janus", "Markus", "Peter", "Line", "Mads", "Søren", "Mathias", "Trine", "Anders"));
        int number = countStringsOfLength(names, 5);
        System.out.println("number = " + number);
        System.out.println();
        printElementsOfLength(names, 5);
        System.out.println();
        System.out.println("Navne med længde = 5 : " + elementsOfLength(names, 5));
    }


    /**
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return the number of elements in strings with the specified length
     */
    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        return countStringsOfLength(strings, length, 0, strings.size()-1);
    }

    public static int countStringsOfLength(ArrayList<String> strings, int length, int left, int right) {
        if (left == right){
            if (strings.get(left).length() == length) {
                return 1;
            }else return 0;
        }
        int pivot = left + (right-left) /2;
        return countStringsOfLength(strings, length, left, pivot) +
        countStringsOfLength(strings, length, pivot+1, right);
    }


    /**
     * Writes the elements of strings to the console with the specified lenght
     * @param strings ArrayList of elements
     * @param length the length to test for
     */
    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        printElementsOfLength(strings, length, 0, strings.size()-1);
    }
    public static void printElementsOfLength(ArrayList<String> strings, int length, int left, int right) {
        if (left == right){
            if (strings.get(left).length() == length) {
                System.out.println(strings.get(left));
            }
            return;
        }
        int pivot = left +(right-left) / 2;
        printElementsOfLength(strings, length, left, pivot);
        printElementsOfLength(strings, length, pivot+1, right);
    }


    /**
     *
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return a new ArrayList with all elements from strings with the specified lenght
     */
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        ArrayList<String> newArrayList = new ArrayList<>();
        elementsOfLength(strings, length, 0, strings.size()-1, newArrayList);
        return newArrayList;
    }
    public static void elementsOfLength(ArrayList<String> strings, int length, int left, int right, ArrayList<String> newArrayList) {
        if (left == right){
            if (strings.get(left).length() == length){
                newArrayList.add(strings.get(left));
            }
            return;
        }
        int pivot = left + (right-left) / 2;
        elementsOfLength(strings, length, left, pivot, newArrayList);
        elementsOfLength(strings, length, pivot+1, right, newArrayList);
    }

}
