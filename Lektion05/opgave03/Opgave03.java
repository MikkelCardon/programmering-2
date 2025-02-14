package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));

            //OPGVAE 01
            runners.forEach(runner -> System.out.println(runner));

            //OPGAVE 02
            runners.forEach(runner -> {if (runner.getLapTime() < 30) System.out.println(runner);
            });

            //OPGAVE 03
            runners.sort((time1, time2) -> time1.getLapTime() - time2.getLapTime());
            System.out.println(runners);
    }
}
