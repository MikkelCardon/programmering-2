package opgave03;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] result = locateSmallest(input);
        System.out.println("Mindste tal er i " + result[0] + ", " + result[1]);
    }

    private static int[] locateSmallest(double[][] input) {
        double smallestNumber = input[0][0];
        int x = 0;
        int y = 0;

        for (int outer = 0; outer < input.length; outer++) {
            for (int inner = 0; inner < input[outer].length; inner++) {
                if (input[outer][inner] < smallestNumber){
                    smallestNumber = input[outer][inner];
                    x = inner;
                    y = outer;
                }
            }
        }

        return new int[]{y, x};
    }
}
