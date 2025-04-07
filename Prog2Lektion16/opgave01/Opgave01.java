package opgave01;

import opgave01.models.BowAndArrowBehavior;
import opgave01.models.King;
import opgave01.models.Knight;
import opgave01.models.Queen;


import java.util.ArrayList;

public class Opgave01 {
    public static void main(String[] args) {
        ArrayList<opgave01.models.Character> characters = new ArrayList<>();

        Knight knight = new Knight();
        characters.add(knight);
        characters.add(new King());
        characters.add(new Queen());

        knight.setWeapon(new BowAndArrowBehavior());

        for (opgave01.models.Character character : characters) {
            System.out.println(character);
            character.fight();
        }


    }
}
