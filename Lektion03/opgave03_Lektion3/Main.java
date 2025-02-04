package opgave03_Lektion3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Chili> chilies = new ArrayList<>();
    public static void main(String[] args) {
        createRandomChilies(20);

        //Make arrayList to array
        Measurable[] measurables = new Chili[chilies.size()];
        for (int i = 0; i < chilies.size(); i++) {
            measurables[i] = chilies.get(i);
            System.out.println(chilies.get(i));
        }

        //Kald metoder
        System.out.println("max(measurables) = " + max(measurables));
        System.out.println("avg(measurables) = " + avg(measurables));

    }

    public static void createChilli(String name, int styrke){
        Chili chili = new Chili(name, styrke);
        chilies.add(chili);
    }

    public static void createRandomChilies(int numberOfChilies) {
        String[] chiliNames = {
                "Habanero", "Jalapeño", "Serrano", "Cayenne", "Ghost Pepper",
                "Carolina Reaper", "Scotch Bonnet", "Thai Pepper", "Chipotle", "Padrón",
                "Pasilla", "Pequin", "Banana Pepper", "Anaheim", "Chili de Arbol",
                "Fresno", "Chile Pasilla de Oaxaca", "Chipotle", "Tabasco", "Tepin"
        };
        Random rand = new Random();

        for (int i = 0; i < numberOfChilies; i++) {
            String name = chiliNames[rand.nextInt(chiliNames.length)];
            int scoville = rand.nextInt(2000000); // Random Scoville value, max 2 million
            createChilli(name, scoville);
        }
    }

    public static Measurable max(Measurable[] objects) {
        Measurable strongestChilli = objects[0];
        for (Measurable object : objects) {
            if (object.getMeasure() > strongestChilli.getMeasure()){
                strongestChilli = object;
            }
        }
        return strongestChilli;
    }

    public static double avg(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum+= object.getMeasure();
        }
        return sum / objects.length;
    }

}
