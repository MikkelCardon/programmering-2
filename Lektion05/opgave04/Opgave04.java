package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Opgave04 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        //OPGAVE 1 og 2
        Iterator<Runner> iterator = runners.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getLapTime() > 40){
                iterator.remove();
            }
        }

        //OPGAVE 5
        runners.removeIf(r -> r.getLapTime() > 40);


        System.out.println(runners);
        System.out.println();

    }
}
