package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        PostFixEvaluator postFixEvaluator = new PostFixEvaluator("12 2 5 + - 4 * 2 /");
        System.out.println(postFixEvaluator.getResult());
    }


}
