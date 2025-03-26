package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        //Print
        System.out.println(mySet);

        //Tilføj 23
        mySet.add(23);

        //Print
        System.out.println(mySet);

        //Fjern
        mySet.remove(67);
        System.out.println(mySet);

        //Tjek indhold
        mySet.contains(23);

        System.out.println("Size: " + mySet.size());
        
    }


}
