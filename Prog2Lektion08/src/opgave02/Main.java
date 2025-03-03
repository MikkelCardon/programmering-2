package opgave02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0, 14, 0, 42, 0, -1, 0 , 101));
        int numberOfZeros = countZeros(integers);
        System.out.println(numberOfZeros);
    }

    private static int countZeros(ArrayList<Integer> integers) {
        return countZeros(integers, 0, integers.size()-1);
    }

    private static int countZeros(ArrayList<Integer> integers, int left, int right) {
        if (left == right){
            if (integers.get(left) == 0) return 1;
            else return 0;
        } else if (left > right) {
            return 0;
        }
        int pivot = left +(right-left) / 2;

        return countZeros(integers, left, pivot) + countZeros(integers, pivot+1, right);
    }
}
