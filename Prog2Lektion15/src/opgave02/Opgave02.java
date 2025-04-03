package opgave02;

import java.util.Stack;

public class Opgave02 {
    public static void main(String[] args) {
        String s = "(3+{5{99{*}}[23[{67}67]]})";
        String s2 = "(}){";

        System.out.println(checkParantes(s2));
    }
    //() [] {}
    private static Stack<Character> stack;

    public static boolean checkParantes(String s){
        stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{'){
                addToStack(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (validParantes(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void addToStack(char character){
        stack.push(character);
    }

    public static boolean validParantes(char character){
        if (stack.isEmpty()) return false;

        char reverseParantes = switch (character){
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
        return stack.peek() == reverseParantes;
    }
}
