package opgave04;

import java.beans.Expression;
import java.util.Stack;

public class PostFixEvaluator {
    private Stack<Integer> stack = new Stack<>();

    public PostFixEvaluator(String s) {
        evaluate(s);
    }

    public void evaluate(String input){
        for (String c : input.split(" ")) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                operation(c);
            }
            else {
                try{
                    int value = Integer.parseInt(String.valueOf(c));
                    stack.push(value);
                } catch (Exception ex){
                    throw new IllegalArgumentException();
                }

            }
        }
    }

    private void operation(String operation) {
        if (stack.size() < 2){
            throw new RuntimeException();
        }

        int int1 = stack.pop();
        int int2 = stack.pop();

        switch (operation){
            case "+" -> {
                stack.push(int1 + int2);
            }
            case "-" -> {
                stack.push(int2 - int1);
            }
            case "*" -> {
                stack.push(int1 * int2);
            }
            case "/" -> {
                stack.push(int2 / int1);
            }
        }
    }

    public int getResult() {
        return stack.pop();
    }
}
