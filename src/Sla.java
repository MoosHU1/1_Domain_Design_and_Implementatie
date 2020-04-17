public class Sla extends Groente {

    public Sla(String vld, String oogst, String gezaaid){
        super(vld, oogst, gezaaid);

    }


    public String toString() {
        return "De sla op veld "+getVeld()+" is gezaaid op "+getGezaaid()+" en is "+getOogstbaar()+" oogstbaar";
    }

}