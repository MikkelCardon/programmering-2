package Opgave01;

public class Opgave01Main {
    public static void main(String[] args) {
        System.out.println("factorial = " + factorial(7, 1));
    }

    public static int factorial(int n, int sum) {
        if (n == 0){
            return sum;
        }
        sum *= n--;
        return factorial(n, sum);
    }
}


