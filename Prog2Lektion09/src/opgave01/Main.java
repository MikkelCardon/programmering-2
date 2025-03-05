package opgave01;

public class Main {
    private static char[][] input = {
            {'M', 'M', 'M', 'S', 'X', 'X', 'M', 'A', 'S', 'M'},
            {'M', 'S', 'A', 'M', 'X', 'M', 'S', 'M', 'S', 'A'},
            {'A', 'M', 'X', 'S', 'X', 'M', 'A', 'A', 'M', 'M'},
            {'M', 'S', 'A', 'M', 'A', 'S', 'M', 'S', 'M', 'X'},
            {'X', 'M', 'A', 'S', 'A', 'M', 'X', 'A', 'M', 'M'},
            {'X', 'X', 'A', 'M', 'M', 'X', 'X', 'A', 'M', 'A'},
            {'S', 'M', 'S', 'M', 'S', 'A', 'S', 'X', 'S', 'S'},
            {'S', 'A', 'X', 'A', 'M', 'A', 'S', 'A', 'A', 'A'},
            {'M', 'A', 'M', 'M', 'M', 'X', 'M', 'M', 'M', 'M'},
            {'M', 'X', 'M', 'X', 'A', 'X', 'M', 'A', 'S', 'X'}
    };
    private static int count = 0;
    private static String xmas = "XMAS";
    private static String reverse = "SAMX";

    public static void main(String[] args) {


        for (int outer = 0; outer < input.length; outer++) {
            for (int inner = 0; inner < input.length; inner++) {
                direction(input[outer][inner], outer, inner, -1, 1);
                direction(input[outer][inner], outer, inner, 0, 1);
                direction(input[outer][inner], outer, inner, +1, 1);
                direction(input[outer][inner], outer, inner, +1, 0);
            }
        }

        System.out.println("Count: "+ count);
    }

    public static void direction(char aChar, int y, int x, int yDif, int xDif){
        String text = String.valueOf(aChar);
        try{
            for (int i = 0; i < 3; i++) {
                x += xDif;
                y += yDif;
                text+= input[y][x];
            }
        } catch (Exception e) {
            return;
        }

        check(text);
    }


    public static void check(String text){
        if (text.equals(xmas) || text.equals(reverse)){
            count++;
        }
    }
}
