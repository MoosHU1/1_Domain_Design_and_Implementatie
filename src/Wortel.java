public class Wortel extends Groente {

    public Wortel(String vld, String oogst, String gezaaid){
        super(vld, oogst, gezaaid);

    }

    public String toString() {
        return "De wortel op veld "+getVeld()+" is gezaaid op "+getGezaaid()+" en is "+getOogstbaar()+" oogstbaar";
    }

}