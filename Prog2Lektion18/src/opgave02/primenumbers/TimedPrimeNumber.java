package opgave02.primenumbers;

import java.time.Duration;
import java.time.Instant;

public class TimedPrimeNumber implements PrimeNumber{
    private PrimeNumber primeNumber;

    public TimedPrimeNumber(PrimeNumber primeNumber) {
        this.primeNumber = primeNumber;
    }

    @Override
    public void find(int n) {
        Instant start = Instant.now();

        primeNumber.find(n);
        System.out.println();
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " ms.");
    }
}
