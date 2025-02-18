package Opgave04;

public class Opgave04Main {
    public static void main(String[] args) {
        String text = "abcdefg";
        System.out.println(reverse(text));
    }
    public static String reverse(String s) {
        if ((s == null) || (s.length() <= 1)){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
