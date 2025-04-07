package Ekstra.exercise4;

import java.util.ArrayList;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        if (!s.contains("@") || s.charAt(0) == '@' || s.charAt(s.length()-1) == '@') return false;


        String[] emailSplit = s.split("@", 2);
        for (int arrayIndex = 0; arrayIndex < emailSplit.length; arrayIndex++) {
            String current = emailSplit[arrayIndex];
            if (current.charAt(0) == '.' || current.charAt(current.length()-1) == '.'){
                return false;
            }
            for (int charIndex = 0; charIndex < current.length()-1; charIndex++) {
                if (current.charAt(charIndex) == '.' && current.charAt(charIndex+1) == '.'){
                    return false;
                }
            }
            if (!isWord(emailSplit[arrayIndex])){
                return false;
            }
        }

        return true;
    }

    /**
     * Returns true, if the param s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        if (possibleCharacters.isEmpty()){
            getPossibleCharachters();
        }

        if (s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!possibleCharacters.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }


    private void getPossibleCharachters() {
        for(char c = 'a'; c <= 'z'; c++){
            possibleCharacters.add(c);
        }
        for(char c = 'A'; c <= 'Z'; c++){
            possibleCharacters.add(c);
        }
        for(char c = '0'; c <= '9'; c++){
            possibleCharacters.add(c);
        }
        possibleCharacters.add('.');
    }

    ArrayList<Character> possibleCharacters = new ArrayList<>();



}
