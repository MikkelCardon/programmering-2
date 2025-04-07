package Ekstra.exercise4;

public class NumberEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid integer or decimal number. */
    @Override
    public boolean isValid(String s) {
        return isInt(s) || isDouble(s);
    }

    private boolean isDouble(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isInt(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
