package opgave02_Lektion3;

public class Customer implements Comparable<Customer>{
    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer other) {
        int comparison = this.fornavn.compareTo(other.getFornavn());
        if (comparison == 0){
            comparison = this.efternavn.compareTo(other.efternavn);
        }
        if (comparison == 0){
            comparison = this.getAlder() - other.getAlder();
        }
        return comparison;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString(){
        return fornavn + " " + efternavn + ", " + alder;
    }
}
