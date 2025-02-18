package Opgave03;

public class Opgave03Main {
    public static void main(String[] args) {
        int n = 3;
        int p = 3;

        System.out.println(power(n,p));
        System.out.println(powerOptimeret(n, p));
    }
    //FØRSTE DELOPGAVE
    public static int power(int n, int p) {
        if (p == 0){
            return 1;
        }

        return power(n, p-1) * n;
    }

    //ANDEN DELOPGAVE
    public static int powerOptimeret(int n, int p) {
        if (p == 0){
            return 1;
        }
        if (p % 2 == 1){
            return powerOptimeret(n, p-1) * n;
        }
        else return powerOptimeret(n*n, p/2);

    }

}
