package Opgave02;

import java.util.ArrayList;

public class Opgave02Main {
    public static void main(String[] args) {
        int n = 10;
        cache = new Long[n+1];

        System.out.println(fibonacci(n, 0, 1));
    }

    private static Long[] cache;

    public static long fibonacci(int n, int numb1, int numb2) {
        if (n == 0){
            return numb1;
        } else if (n == 1) return numb2;

        if (cache[n] != null){
            return cache[n];
        }
        long temp = fibonacci(n-1, numb2, numb1+numb2);
        cache[n] = temp;
        return temp;
    }
}
