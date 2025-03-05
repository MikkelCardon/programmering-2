package opgave02;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {1, 2, 3, 4.0},
                {5, 6.5, 7, 8},
                {9, 10, 11, 10},
                {13, 14, 15, 16}
        };
        System.out.println(avarageMajorDiagonal(input));
    }

    private static double avarageMajorDiagonal(double[][] input) {
        double sum = 0;
        for (int i = 0; i < input[0].length; i++) {
            sum+= input[i][i];
        }
        return sum / input[0].length;
    }
}
