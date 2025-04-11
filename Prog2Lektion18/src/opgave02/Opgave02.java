package opgave02;

import opgave02.primenumbers.FindPrimtal;
import opgave02.primenumbers.PrimeNumber;
import opgave02.primenumbers.TimedPrimeNumber;

public class Opgave02 {
    public static void main(String[] args) {

        PrimeNumber findMedTid = new TimedPrimeNumber(new FindPrimtal());
        findMedTid.find(10_000_000);
    }
}
